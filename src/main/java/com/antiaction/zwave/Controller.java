package com.antiaction.zwave;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

import com.antiaction.zwave.constants.CommandClass;
import com.antiaction.zwave.constants.Constants;
import com.antiaction.zwave.messages.ApplicationCommandHandlerResp;
import com.antiaction.zwave.messages.ApplicationUpdateResp;
import com.antiaction.zwave.messages.GetCapabilitiesReq;
import com.antiaction.zwave.messages.GetControllerParamsReq;
import com.antiaction.zwave.messages.IdentifyNodeReq;
import com.antiaction.zwave.messages.SendDataReq;
import com.antiaction.zwave.messages.SerialApiGetInitDataReq;
import com.antiaction.zwave.messages.SetControllerParamReq;
import com.antiaction.zwave.messages.command.ApplicationCommandHandlerData;
import com.antiaction.zwave.messages.command.BasicCommand;
import com.antiaction.zwave.messages.command.BasicCommand.Basic;
import com.antiaction.zwave.messages.command.BatteryCommand;
import com.antiaction.zwave.messages.command.BatteryCommand.Battery;
import com.antiaction.zwave.messages.command.ManufacturerSpecificCommand;
import com.antiaction.zwave.messages.command.ManufacturerSpecificCommand.ManufacturerSpecific;
import com.antiaction.zwave.messages.command.WakeUpCommand;
import com.antiaction.zwave.transport.SerialTransport;

public class Controller implements Runnable {

	protected SerialTransport transport;

	protected OutputStream out;

	protected InputStream in;

	protected GenericQueue<byte[]> queueIn;

	protected GenericQueue<byte[]> queueOut;

	protected TransmitterThread transmitterThread;

	protected ReceiverThread receiverThread;

	public Controller() {
	}

	public void open(SerialTransport transport) {
		queueIn = new GenericQueue<byte[]>();
		queueOut = new GenericQueue<byte[]>();
		transmitterThread = new TransmitterThread(queueOut, transport.getOutputStream());
		transmitterThread.start();
		receiverThread = new ReceiverThread(transport.getInputStream(), queueIn, queueOut);
		receiverThread.start();
	}

	public void close() {
	}

	public void callback(int command, CallbackResponse callbackResponse) {
		synchronized (callbacks) {
			List<CallbackResponse> callbackList = callbacks.get(command);
			if (callbackList == null) {
				callbackList = new LinkedList<>();
				callbacks.put(command, callbackList);
			}
			callbackList.add(callbackResponse);
		}
	}

	public void sendMessage(byte[] frame) {
		queueOut.insert(frame);
	}

	public byte[] receiveRaw() {
		return queueIn.remove();
	}

	public SerialApiGetInitDataReq getSerialApiGetInitData() {
		return SerialApiGetInitDataReq.getInstance(this);
	}

	public GetCapabilitiesReq getGetCapabilitiesReq() {
		return GetCapabilitiesReq.getInstance(this);
	}

	public IdentifyNodeReq getIdentifyNode() {
		return IdentifyNodeReq.getInstance(this);
	}

	public SetControllerParamReq getSetControllerParam() {
		return SetControllerParamReq.getInstance(this);
	}

	public GetControllerParamsReq getGetControllerParams() {
		return GetControllerParamsReq.getInstance(this);
	}

	public SendDataReq getSendDataReq() {
		return SendDataReq.getInstance(this);
	}

	protected Map<Integer, List<CallbackResponse>> callbacks = new TreeMap<>();

	public void run() {
		byte[] frame;
		int command;
		List<CallbackResponse> callbackList;
		CallbackResponse callback;
		boolean bLoop = true;
		while (bLoop) {
			frame = queueIn.remove();
			command = frame[3] & 255;
			callback = null;
			synchronized (callbacks) {
				callbackList = callbacks.get(command);
				if (callbackList != null && callbackList.size() > 0) {
					callback = callbackList.remove(0);
				}
			}
			if (callback != null) {
				callback.disassemble(frame);
			}
			else {
				switch (command) {
				case 0x49:
					// Wake up event.
					ApplicationUpdateResp applicationUpdateResp = ApplicationUpdateResp.getInstance(this);
					applicationUpdateResp.disassemble(frame);
					onApplicationUpdate(applicationUpdateResp);
					break;
				case 0x04:
					// Sensor data.
					ApplicationCommandHandlerResp applicationCommandHandlerResp = ApplicationCommandHandlerResp.getInstance(this);
					applicationCommandHandlerResp.disassemble(frame);
					onApplicationCommandHandler(applicationCommandHandlerResp);
					break;
				}
				// debug
				//System.out.println(pkt.length);
			}
		}
	}

	/** Set of registered listeners. */
	private Set<ApplicationListener> listenerSet = new HashSet<ApplicationListener>();

    /**
     * Adds a listener to the list that is notified each time a change
     * to the data model occurs.
     * @param l	the ApplicationListener
     */
	public void addListener(ApplicationListener l) {
		synchronized ( listenerSet ) {
			listenerSet.add( l );
		}
	}

    /**
     * Removes a listener from the list that is notified each time a
     * change to the data model occurs.
     * @param l the ApplicationListener
     */
	public void removeListener(ApplicationListener l) {
		synchronized ( listenerSet ) {
			listenerSet.remove( l );
		}
	}

	public void onApplicationUpdate(ApplicationUpdateResp applicationUpdateResp) {
		synchronized ( listenerSet ) {
			Iterator<ApplicationListener> listeners = listenerSet.iterator();
			while ( listeners.hasNext() ) {
				listeners.next().onApplicationUpdate(applicationUpdateResp);
			}
		}
	}

	public void onApplicationCommandHandler(ApplicationCommandHandlerResp applicationCommandHandlerResp) {
		// debug
		/*
		Optional<CommandClass> optionalCommandClass = CommandClass.getType(applicationCommandHandlerResp.payload[0]);
		String commandClassStr;
		if (optionalCommandClass.isPresent()) {
			CommandClass commandClass = optionalCommandClass.get();
			commandClassStr = commandClass.getLabel() + " (" + HexUtils.hexString(applicationCommandHandlerResp.payload[0]) + ")";
		}
		else {
			commandClassStr = "Unknown (" + HexUtils.hexString(applicationCommandHandlerResp.payload[0]) + ")";
		}
		*/
		// debug
		//System.out.println("ApplicationCommandHandlerResp nodeId: " + applicationCommandHandlerResp.nodeId + " CommandClass: " + commandClassStr );

		byte[] data = applicationCommandHandlerResp.payload;

		// CommandClass.
		switch (data[0]) {
		case (byte)0x20:
			Basic basicResp = BasicCommand.disassemble(data);
			applicationCommandHandlerResp.data = basicResp;
			break;
		case (byte)0x72:
			ManufacturerSpecific manufacturerSpecificResp = ManufacturerSpecificCommand.disassemble(data);
			applicationCommandHandlerResp.data = manufacturerSpecificResp;
			break;
		case (byte)0x80:
			Battery battery = BatteryCommand.disassemble(data);
			applicationCommandHandlerResp.data = battery;
			break;
		case (byte)0x84:
			ApplicationCommandHandlerData achData = WakeUpCommand.disassemble(data);
			applicationCommandHandlerResp.data = achData;
			break;
		case 0x31:
			if (data[1] == 0x05 && data[2] == 0x01) {
				Float temp = new Float(data[4] & 255);
				switch (data[3]) {
				case 1:
    	               temp = ((temp - 170.0f) / 10.0f) + 41.1f;
					break;
				case 2:
    	               temp = ((temp - 170.0f) / 10.0f) + 68.2f;
					break;
				case 3:
    	               temp = ((temp - 25.0f) / 10.0f) + 79.3f;
					break;
				}
				Float temp2 = (temp -32) * 5.0f / 9.0f;

				// debug
				System.out.println(Constants.INDENT + "Node " + applicationCommandHandlerResp.nodeId + " temperature: " + temp + "F / " + temp2 + "C");
			}
			else {
				// debug
				System.out.println(Constants.INDENT + "Node " + applicationCommandHandlerResp.nodeId + " unsupported data: " + HexUtils.hexString(data));
			}
			break;
		default:
			// debug
			System.out.println(Constants.INDENT + "Node " + applicationCommandHandlerResp.nodeId + " unsupported data: " + HexUtils.hexString(data));
			break;
		}

		synchronized ( listenerSet ) {
			Iterator<ApplicationListener> listeners = listenerSet.iterator();
			while ( listeners.hasNext() ) {
				listeners.next().onApplicationCommandHandler(applicationCommandHandlerResp);
			}
		}
	}

}

/*

BASIC

[2016-05-22 01:55:25.953 +0200] > 0x01 0x09 0x00 0x04 0x00 0x02 0x03 0x20 0x01 0xFF 0x2D
                                  Node 2 unsupported data: 0x20 0x01 0xFF

[2016-05-22 00:44:31.886 +0200] > 0x01 0x09 0x00 0x04 0x00 0x02 0x03 0x20 0x01 0x00 0xD2
                                  Node 2 unsupported data: 0x20 0x01 0x00

SENSOR_MULTILEVEL

[2016-05-22 00:59:16.509 +0200] > 0x01 0x0C 0x00 0x04 0x00 0x02 0x06 0x31 0x05 0x01 0x22 0x01 0x0C 0xE9
                                  Node 2 temperature: 1.0F / -17.222221C

[2016-05-22 00:59:16.925 +0200] > 0x01 0x0B 0x00 0x04 0x00 0x02 0x05 0x31 0x05 0x05 0x01 0x27 0xE0
                                  Node 2 unsupported data: 0x31 0x05 0x05 0x01 0x27

[2016-05-22 00:59:17.805 +0200] > 0x01 0x0C 0x00 0x04 0x00 0x02 0x06 0x31 0x05 0x03 0x0A 0x00 0x00 0xCE
                                  Node 2 unsupported data: 0x31 0x05 0x03 0x0A 0x00 0x00

[2016-05-22 00:59:17.925 +0200] > 0x01 0x0B 0x00 0x04 0x00 0x02 0x05 0x31 0x05 0x1B 0x01 0x00 0xD9
                                  Node 2 unsupported data: 0x31 0x05 0x1B 0x01 0x00

[2016-05-22 01:59:18.056 +0200] > 0x01 0x0C 0x00 0x04 0x00 0x02 0x06 0x31 0x05 0x01 0x22 0x01 0x0A 0xEF
                                  Node 2 temperature: 1.0F / -17.222221C

[2016-05-22 01:59:18.472 +0200] > 0x01 0x0B 0x00 0x04 0x00 0x02 0x05 0x31 0x05 0x05 0x01 0x29 0xEE
                                  Node 2 unsupported data: 0x31 0x05 0x05 0x01 0x29

[2016-05-22 01:59:19.352 +0200] > 0x01 0x0C 0x00 0x04 0x00 0x02 0x06 0x31 0x05 0x03 0x0A 0x00 0x00 0xCE
                                  Node 2 unsupported data: 0x31 0x05 0x03 0x0A 0x00 0x00

[2016-05-22 01:59:19.472 +0200] > 0x01 0x0B 0x00 0x04 0x00 0x02 0x05 0x31 0x05 0x1B 0x01 0x00 0xD9
                                  Node 2 unsupported data: 0x31 0x05 0x1B 0x01 0x00

THERMOSTAT_SETPOINT

[2016-05-22 00:39:40.431 +0200] > 0x01 0x0C 0x00 0x04 0x00 0x03 0x06 0x43 0x03 0x01 0x42 0x0A 0x28 0xD3
                                  Node 3 unsupported data: 0x43 0x03 0x01 0x42 0x0A 0x28

[2016-05-22 01:08:49.673 +0200] > 0x01 0x0C 0x00 0x04 0x00 0x03 0x06 0x43 0x03 0x01 0x42 0x0A 0x28 0xD3
                                  Node 3 unsupported data: 0x43 0x03 0x01 0x42 0x0A 0x28

[2016-05-22 01:37:58.055 +0200] > 0x01 0x0C 0x00 0x04 0x00 0x03 0x06 0x43 0x03 0x01 0x42 0x0A 0x28 0xD3
                                  Node 3 unsupported data: 0x43 0x03 0x01 0x42 0x0A 0x28

CLIMATE_CONTROL_SCHEDULE

[2016-05-22 00:39:40.491 +0200] > 0x01 0x0A 0x00 0x04 0x00 0x03 0x04 0x46 0x08 0x00 0x7F 0xC7
                                  Node 3 unsupported data: 0x46 0x08 0x00 0x7F

[2016-05-22 01:08:49.730 +0200] > 0x01 0x0A 0x00 0x04 0x00 0x03 0x04 0x46 0x08 0x00 0x7F 0xC7
                                  Node 3 unsupported data: 0x46 0x08 0x00 0x7F

[2016-05-22 01:37:58.112 +0200] > 0x01 0x0A 0x00 0x04 0x00 0x03 0x04 0x46 0x08 0x00 0x7F 0xC7
                                  Node 3 unsupported data: 0x46 0x08 0x00 0x7F

ALARM

[2016-05-22 00:44:32.208 +0200] > 0x01 0x10 0x00 0x04 0x00 0x02 0x0A 0x71 0x05 0x00 0x00 0x00 0xFF 0x07 0x00 0x00 0x00 0x6F
                                  Node 2 unsupported data: 0x71 0x05 0x00 0x00 0x00 0xFF 0x07 0x00 0x00 0x00

[2016-05-22 01:55:26.275 +0200] > 0x01 0x10 0x00 0x04 0x00 0x02 0x0A 0x71 0x05 0x00 0x00 0x00 0xFF 0x07 0x08 0x00 0x00 0x67
                                  Node 2 unsupported data: 0x71 0x05 0x00 0x00 0x00 0xFF 0x07 0x08 0x00 0x00
*/