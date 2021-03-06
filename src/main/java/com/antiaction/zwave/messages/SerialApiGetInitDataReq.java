package com.antiaction.zwave.messages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

import com.antiaction.zwave.Controller;
import com.antiaction.zwave.FrameUtils;
import com.antiaction.zwave.Request;
import com.antiaction.zwave.Response;
import com.antiaction.zwave.constants.Constants;
import com.antiaction.zwave.constants.ControllerMessageType;
import com.antiaction.zwave.constants.ControllerMode;
import com.antiaction.zwave.constants.ControllerType;
import com.antiaction.zwave.constants.MessageType;

/**
 *  Req: 0x01 0x03 0x00 0x02 0xFE
 * Resp: 0x01 0x25 0x01 0x02 0x05 0x00 0x1D 0x07 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x05 0x00 0xC3
 * @author nicl
 */
public class SerialApiGetInitDataReq extends Request {

	private static final int CONTROLLER_MESSAGE_TYPE = ControllerMessageType.SerialApiGetInitData.getId() & 255;

	protected Controller controller;

	protected byte[] frame;

	protected SerialApiGetInitDataResp response;

	protected SerialApiGetInitDataReq(Controller controller) {
		this.controller = controller;
	}

	public static SerialApiGetInitDataReq getInstance(Controller controller) {
		return new SerialApiGetInitDataReq(controller);
	}

	public SerialApiGetInitDataReq build() {
		byte[] data = new byte[] {
				(byte)CONTROLLER_MESSAGE_TYPE
		};
		frame = FrameUtils.assemble(MessageType.Request, data );
		return this;
	}

	@Override
	public SerialApiGetInitDataResp send() {
		if (frame == null) {
			throw new IllegalStateException("frame not built!");
		}
		response = SerialApiGetInitDataResp.getInstance(controller);
		controller.sendMessage(this);
		return response;
	}

	@Override
	public byte[] getFrame() {
		if (frame == null) {
			throw new IllegalStateException("frame not built!");
		}
		return frame;
	}

	@Override 
	public SerialApiGetInitDataResp getResponse() {
		return response;
	}

	public static class SerialApiGetInitDataResp extends Response {

		protected Controller controller;

		protected Semaphore semaphore = new Semaphore(0);

		protected byte[] frame;

		public ControllerMode controllerMode;

		public ControllerType controllerType;

		public List<Integer> registeredDevices;

		protected SerialApiGetInitDataResp(Controller controller) {
			this.controller = controller;
		}

		public static SerialApiGetInitDataResp getInstance(Controller controller) {
			return new SerialApiGetInitDataResp(controller);
		}

		public boolean accept(byte[] frame) {
			if (frame[Constants.PKT_IDX_PACKET_TYPE] == Constants.SOF && frame[Constants.PKT_IDX_MSG_TYPE] == MessageType.Response.ordinal()) {
				if (frame[Constants.PKT_IDX_COMMAND] == Constants.FUNCTION_REGISTERED_DEVICES) {
					return true;
				}
			}
			return false;
		}

		@Override
		public void disassemble(byte[] frame) {
			this.frame = frame;
			byte[] data = FrameUtils.disassemble(frame);
			controllerMode = ((data[1] & 0x01) == 1) ? ControllerMode.SLAVE : ControllerMode.CONTROLLER;
			controllerType = ((data[1] & 0x04) == 1) ? ControllerType.SECONDARY : ControllerType.PRIMARY;
			registeredDevices = new ArrayList<Integer>(232);
			int idx = 2;
			int len = data[idx++] & 255;
			int bits;
			int bit = 1;
			while (len > 0) {
				bits = data[idx++] & 255;
				--len;
				for (int i=0; i<8; ++i) {
					if ((bits & 1) == 1) {
						// debug
						//System.out.println("id: " + bit);
						registeredDevices.add(bit);
					}
					bits >>= 1;
					++bit;
				}
			}
			semaphore.release();
		}

		public void waitFor() {
			try {
				semaphore.acquire();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
