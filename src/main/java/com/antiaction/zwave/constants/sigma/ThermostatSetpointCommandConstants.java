package com.antiaction.zwave.constants.sigma;

public class ThermostatSetpointCommandConstants {

	/* Thermostat Setpoint command class commands */
	public static final int THERMOSTAT_SETPOINT_VERSION = 0x01;
	public static final int THERMOSTAT_SETPOINT_GET = 0x02;
	public static final int THERMOSTAT_SETPOINT_REPORT = 0x03;
	public static final int THERMOSTAT_SETPOINT_SET = 0x01;
	public static final int THERMOSTAT_SETPOINT_SUPPORTED_GET = 0x04;
	public static final int THERMOSTAT_SETPOINT_SUPPORTED_REPORT = 0x05;
	/* Values used for Thermostat Setpoint Get command */
	public static final int THERMOSTAT_SETPOINT_GET_LEVEL_SETPOINT_TYPE_MASK = 0x0F;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED = 0x00;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_HEATING_1 = 0x01;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_COOLING_1 = 0x02;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED1 = 0x03;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED2 = 0x04;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED3 = 0x05;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED4 = 0x06;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_FURNACE = 0x07;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_DRY_AIR = 0x08;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_MOIST_AIR = 0x09;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_AUTO_CHANGEOVER = 0x0A;
	public static final int THERMOSTAT_SETPOINT_GET_LEVEL_RESERVED_MASK = 0xF0;
	public static final int THERMOSTAT_SETPOINT_GET_LEVEL_RESERVED_SHIFT = 0x04;
	/* Values used for Thermostat Setpoint Report command */
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL_SETPOINT_TYPE_MASK = 0x0F;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED = 0x00;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_HEATING_1 = 0x01;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_COOLING_1 = 0x02;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED1 = 0x03;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED2 = 0x04;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED3 = 0x05;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED4 = 0x06;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_FURNACE = 0x07;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_DRY_AIR = 0x08;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_MOIST_AIR = 0x09;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_AUTO_CHANGEOVER = 0x0A;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL_RESERVED_MASK = 0xF0;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL_RESERVED_SHIFT = 0x04;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_SIZE_MASK = 0x07;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_SCALE_MASK = 0x18;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_SCALE_SHIFT = 0x03;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_PRECISION_MASK = 0xE0;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_PRECISION_SHIFT = 0x05;
	/* Values used for Thermostat Setpoint Set command */
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL_SETPOINT_TYPE_MASK = 0x0F;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED = 0x00;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_HEATING_1 = 0x01;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_COOLING_1 = 0x02;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED1 = 0x03;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED2 = 0x04;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED3 = 0x05;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED4 = 0x06;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_FURNACE = 0x07;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_DRY_AIR = 0x08;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_MOIST_AIR = 0x09;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_AUTO_CHANGEOVER = 0x0A;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL_RESERVED_MASK = 0xF0;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL_RESERVED_SHIFT = 0x04;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_SIZE_MASK = 0x07;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_SCALE_MASK = 0x18;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_SCALE_SHIFT = 0x03;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_PRECISION_MASK = 0xE0;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_PRECISION_SHIFT = 0x05;
	/* Thermostat Setpoint command class commands */
	public static final int THERMOSTAT_SETPOINT_VERSION_V2 = 0x02;
	public static final int THERMOSTAT_SETPOINT_GET_V2 = 0x02;
	public static final int THERMOSTAT_SETPOINT_REPORT_V2 = 0x03;
	public static final int THERMOSTAT_SETPOINT_SET_V2 = 0x01;
	public static final int THERMOSTAT_SETPOINT_SUPPORTED_GET_V2 = 0x04;
	public static final int THERMOSTAT_SETPOINT_SUPPORTED_REPORT_V2 = 0x05;
	/* Values used for Thermostat Setpoint Get command */
	public static final int THERMOSTAT_SETPOINT_GET_LEVEL_SETPOINT_TYPE_MASK_V2 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED_V2 = 0x00;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_HEATING_1_V2 = 0x01;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_COOLING_1_V2 = 0x02;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED1_V2 = 0x03;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED2_V2 = 0x04;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED3_V2 = 0x05;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED4_V2 = 0x06;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_FURNACE_V2 = 0x07;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_DRY_AIR_V2 = 0x08;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_MOIST_AIR_V2 = 0x09;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_AUTO_CHANGEOVER_V2 = 0x0A;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V2 = 0x0B;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V2 = 0x0C;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_AWAY_HEATING_V2 = 0x0D;
	public static final int THERMOSTAT_SETPOINT_GET_LEVEL_RESERVED_MASK_V2 = 0xF0;
	public static final int THERMOSTAT_SETPOINT_GET_LEVEL_RESERVED_SHIFT_V2 = 0x04;
	/* Values used for Thermostat Setpoint Report command */
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL_SETPOINT_TYPE_MASK_V2 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED_V2 = 0x00;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_HEATING_1_V2 = 0x01;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_COOLING_1_V2 = 0x02;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED1_V2 = 0x03;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED2_V2 = 0x04;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED3_V2 = 0x05;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED4_V2 = 0x06;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_FURNACE_V2 = 0x07;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_DRY_AIR_V2 = 0x08;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_MOIST_AIR_V2 = 0x09;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_AUTO_CHANGEOVER_V2 = 0x0A;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V2 = 0x0B;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V2 = 0x0C;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_AWAY_HEATING_V2 = 0x0D;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL_RESERVED_MASK_V2 = 0xF0;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL_RESERVED_SHIFT_V2 = 0x04;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_SIZE_MASK_V2 = 0x07;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_SCALE_MASK_V2 = 0x18;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_SCALE_SHIFT_V2 = 0x03;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_PRECISION_MASK_V2 = 0xE0;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_PRECISION_SHIFT_V2 = 0x05;
	/* Values used for Thermostat Setpoint Set command */
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL_SETPOINT_TYPE_MASK_V2 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED_V2 = 0x00;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_HEATING_1_V2 = 0x01;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_COOLING_1_V2 = 0x02;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED1_V2 = 0x03;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED2_V2 = 0x04;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED3_V2 = 0x05;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED4_V2 = 0x06;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_FURNACE_V2 = 0x07;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_DRY_AIR_V2 = 0x08;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_MOIST_AIR_V2 = 0x09;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_AUTO_CHANGEOVER_V2 = 0x0A;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V2 = 0x0B;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V2 = 0x0C;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_AWAY_HEATING_V2 = 0x0D;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL_RESERVED_MASK_V2 = 0xF0;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL_RESERVED_SHIFT_V2 = 0x04;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_SIZE_MASK_V2 = 0x07;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_SCALE_MASK_V2 = 0x18;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_SCALE_SHIFT_V2 = 0x03;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_PRECISION_MASK_V2 = 0xE0;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_PRECISION_SHIFT_V2 = 0x05;
	/* Thermostat Setpoint command class commands */
	public static final int THERMOSTAT_SETPOINT_VERSION_V3 = 0x03;
	public static final int THERMOSTAT_SETPOINT_GET_V3 = 0x02;
	public static final int THERMOSTAT_SETPOINT_REPORT_V3 = 0x03;
	public static final int THERMOSTAT_SETPOINT_SET_V3 = 0x01;
	public static final int THERMOSTAT_SETPOINT_SUPPORTED_GET_V3 = 0x04;
	public static final int THERMOSTAT_SETPOINT_SUPPORTED_REPORT_V3 = 0x05;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_V3 = 0x09;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_V3 = 0x0A;
	/* Values used for Thermostat Setpoint Get command */
	public static final int THERMOSTAT_SETPOINT_GET_LEVEL_SETPOINT_TYPE_MASK_V3 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED_V3 = 0x00;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_HEATING_1_V3 = 0x01;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_COOLING_1_V3 = 0x02;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED1_V3 = 0x03;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED2_V3 = 0x04;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED3_V3 = 0x05;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_NOT_SUPPORTED4_V3 = 0x06;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_FURNACE_V3 = 0x07;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_DRY_AIR_V3 = 0x08;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_MOIST_AIR_V3 = 0x09;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_AUTO_CHANGEOVER_V3 = 0x0A;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V3 = 0x0B;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V3 = 0x0C;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_AWAY_HEATING_V3 = 0x0D;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_AWAY_COOLING_V3 = 0x0E;
	public static final int THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_FULL_POWER_V3 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_GET_LEVEL_RESERVED_MASK_V3 = 0xF0;
	public static final int THERMOSTAT_SETPOINT_GET_LEVEL_RESERVED_SHIFT_V3 = 0x04;
	/* Values used for Thermostat Setpoint Report command */
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL_SETPOINT_TYPE_MASK_V3 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED_V3 = 0x00;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_HEATING_1_V3 = 0x01;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_COOLING_1_V3 = 0x02;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED1_V3 = 0x03;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED2_V3 = 0x04;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED3_V3 = 0x05;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_NOT_SUPPORTED4_V3 = 0x06;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_FURNACE_V3 = 0x07;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_DRY_AIR_V3 = 0x08;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_MOIST_AIR_V3 = 0x09;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_AUTO_CHANGEOVER_V3 = 0x0A;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V3 = 0x0B;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V3 = 0x0C;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_AWAY_HEATING_V3 = 0x0D;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_AWAY_COOLING_V3 = 0x0E;
	public static final int THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_FULL_POWER_V3 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL_RESERVED_MASK_V3 = 0xF0;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL_RESERVED_SHIFT_V3 = 0x04;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_SIZE_MASK_V3 = 0x07;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_SCALE_MASK_V3 = 0x18;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_SCALE_SHIFT_V3 = 0x03;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_PRECISION_MASK_V3 = 0xE0;
	public static final int THERMOSTAT_SETPOINT_REPORT_LEVEL2_PRECISION_SHIFT_V3 = 0x05;
	/* Values used for Thermostat Setpoint Set command */
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL_SETPOINT_TYPE_MASK_V3 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED_V3 = 0x00;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_HEATING_1_V3 = 0x01;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_COOLING_1_V3 = 0x02;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED1_V3 = 0x03;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED2_V3 = 0x04;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED3_V3 = 0x05;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_NOT_SUPPORTED4_V3 = 0x06;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_FURNACE_V3 = 0x07;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_DRY_AIR_V3 = 0x08;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_MOIST_AIR_V3 = 0x09;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_AUTO_CHANGEOVER_V3 = 0x0A;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V3 = 0x0B;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V3 = 0x0C;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_AWAY_HEATING_V3 = 0x0D;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_AWAY_COOLING_V3 = 0x0E;
	public static final int THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_FULL_POWER_V3 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL_RESERVED_MASK_V3 = 0xF0;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL_RESERVED_SHIFT_V3 = 0x04;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_SIZE_MASK_V3 = 0x07;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_SCALE_MASK_V3 = 0x18;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_SCALE_SHIFT_V3 = 0x03;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_PRECISION_MASK_V3 = 0xE0;
	public static final int THERMOSTAT_SETPOINT_SET_LEVEL2_PRECISION_SHIFT_V3 = 0x05;
	/* Values used for Thermostat Setpoint Capabilities Get command */
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_PROPERTIES1_SETPOINT_TYPE_MASK_V3 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_NOT_SUPPORTED_V3 = 0x00;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_HEATING_1_V3 = 0x01;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_COOLING_1_V3 = 0x02;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_NOT_SUPPORTED1_V3 = 0x03;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_NOT_SUPPORTED2_V3 = 0x04;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_NOT_SUPPORTED3_V3 = 0x05;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_NOT_SUPPORTED4_V3 = 0x06;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_FURNACE_V3 = 0x07;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_DRY_AIR_V3 = 0x08;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_MOIST_AIR_V3 = 0x09;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_AUTO_CHANGEOVER_V3 = 0x0A;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V3 = 0x0B;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V3 = 0x0C;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_AWAY_HEATING_V3 = 0x0D;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_AWAY_COOLING_V3 = 0x0E;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_SETPOINT_TYPE_FULL_POWER_V3 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_PROPERTIES1_RESERVED_MASK_V3 = 0xF0;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_GET_PROPERTIES1_RESERVED_SHIFT_V3 = 0x04;
	/* Values used for Thermostat Setpoint Capabilities Report command */
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES1_SETPOINT_TYPE_MASK_V3 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_NOT_SUPPORTED_V3 = 0x00;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_HEATING_1_V3 = 0x01;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_COOLING_1_V3 = 0x02;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_NOT_SUPPORTED1_V3 = 0x03;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_NOT_SUPPORTED2_V3 = 0x04;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_NOT_SUPPORTED3_V3 = 0x05;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_NOT_SUPPORTED4_V3 = 0x06;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_FURNACE_V3 = 0x07;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_DRY_AIR_V3 = 0x08;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_MOIST_AIR_V3 = 0x09;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_AUTO_CHANGEOVER_V3 = 0x0A;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_ENERGY_SAVE_HEATING_V3 = 0x0B;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_ENERGY_SAVE_COOLING_V3 = 0x0C;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_AWAY_HEATING_V3 = 0x0D;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_AWAY_COOLING_V3 = 0x0E;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_SETPOINT_TYPE_FULL_POWER_V3 = 0x0F;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES1_RESERVED_MASK_V3 = 0xF0;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES1_RESERVED_SHIFT_V3 = 0x04;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES2_SIZE1_MASK_V3 = 0x07;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES2_SCALE1_MASK_V3 = 0x18;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES2_SCALE1_SHIFT_V3 = 0x03;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES2_PRECISION1_MASK_V3 = 0xE0;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES2_PRECISION1_SHIFT_V3 = 0x05;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES3_SIZE2_MASK_V3 = 0x07;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES3_SCALE2_MASK_V3 = 0x18;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES3_SCALE2_SHIFT_V3 = 0x03;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES3_PRECISION2_MASK_V3 = 0xE0;
	public static final int THERMOSTAT_SETPOINT_CAPABILITIES_REPORT_PROPERTIES3_PRECISION2_SHIFT_V3 = 0x05;

}
