package team3176.robot.constants;

import team3176.robot.Constants;
import team3176.robot.Constants.RobotType;

/** File for storing all hardware IDs to prevent double assignments */
public class Hardwaremap {
  /*
   * Superstructer CIDs & CBNs
   */
  public static final int conveyor = 3;
  public static final int shooterTransfer_CID = 5;
  public static final int shooterPivot_CID = 8;
  public static final int indexerRoller_CID = 9;
  public static final int armRoller_CID = 28;  
  public static final int armPivot_CID = 29;
  public static final int armCancoder_CID = 28;
  public static final int indexerPivot_CID = 4;
  public static final int climb_CID = 8;
  public static final int elevatorLeft_CID = 60;
  public static final int elevatorRight_CID = 61;
  public static int PDH_CID = 1;

  public static final String conveyor_CBN = "rio";
  public static final String shooterWheelUpper_CBN = "rio";
  public static final String shooterWheelLower_CBN = "rio";
  public static final String shooterTransfer_CBN = "rio";
  public static final String shooterPivot_CBN = "rio";
  public static final String armRoller_CBN = "rio";
  public static final String armPivot_CBN = "rio";
  public static final String indexerPivot_CBN = "rio";
  /*   public static final String LaserCan_CBN = "rio"; */
  public static final String climb_CBN = "rio";
  public static final String elevatorLeft_CBN = "rio";
  public static final String elevatorRight_CBN = "rio";
  public static final String indexerRoller_CBN = "rio";

  public static String PDH_CBN = "rio";

  // public static final int elevatorLeaderLimitSwitch_DIO = 5;
  // public static final int elevatorFollowerLimitSwitch_DIO = 6;
  //public static final int climbLimitSwitch_DIO = 9;
  public static final int elevatorBotLimitSwitch_DIO = 9;
  public static final int elevatorTopLimitSwitch_DIO = 0; // 1;
  // public static final int armRollerLinebreak_DIO = 5;
  // public static final int armPivotLinebreak_DIO = 4;
  //public static final int armUpperLimitSwitch_DIO = 7;
  //public static final int armLowerLimitSwitch_DIO = 8; // 7;
  public static final int indexerUpperLimitSwitch_DIO = 7;
  public static final int indexerLowerLimitSwitch_DIO = 8; // 7;
  public static final int shooterPivotLower_DIO = 2; // 8;
  public static final int shooterPivotUpper_DIO = 1; // 9;
  public static final int conveyorFrontLinebreak = 6;
  public static final int conveyorBackLinebreak = 4;

  public static final int blinkin_pwm_port = 9;

  /*
  
   */
  // statics constants for swerve pods
  public static final String SWERVEPOD_CTRE_CBN =
      Constants.getRobot() == RobotType.ROBOT_2025C ? "canivore" : "rio";
  public static final String SWERVEPOD_CBN = SWERVEPOD_CTRE_CBN;
  public static final SwervePodHardwareID POD004 =
      new SwervePodHardwareID(1, 40, SWERVEPOD_CBN, 11, SWERVEPOD_CBN, 42, SWERVEPOD_CBN, -38.6, true);
  public static final SwervePodHardwareID POD005 =
      new SwervePodHardwareID(2, 13, SWERVEPOD_CBN, 21, SWERVEPOD_CBN, 14, SWERVEPOD_CBN, 56.25, true);
  public static final SwervePodHardwareID POD007 =
      new SwervePodHardwareID(3, 33, SWERVEPOD_CBN, 31, SWERVEPOD_CBN, 34, SWERVEPOD_CBN, -149.678, true);
  public static final SwervePodHardwareID POD003 =
      new SwervePodHardwareID(
          4, 43, SWERVEPOD_CBN, 41, SWERVEPOD_CBN, 32, SWERVEPOD_CBN, -168.135, false);
  public static final SwervePodHardwareID POD009 =
      new SwervePodHardwareID(5, 13, SWERVEPOD_CBN, 14, SWERVEPOD_CBN, 15, SWERVEPOD_CBN, 103.525, false);

  public static final String SWERVEPOD_REV_CBN = "rio";

  public static final SwervePodHardwareID FR = POD007;
  public static final SwervePodHardwareID FL = POD005;
  public static final SwervePodHardwareID BL = POD004;
  public static final SwervePodHardwareID BR = POD003;

  public static final int STEER_FR_CID = 11;
  public static final int STEER_FL_CID = 21;
  public static final int STEER_BL_CID = 31;
  public static final int STEER_BR_CID = 41;
  public static final String STEER_FR_CBN = SWERVEPOD_REV_CBN;
  public static final String STEER_FL_CBN = SWERVEPOD_REV_CBN;
  public static final String STEER_BL_CBN = SWERVEPOD_REV_CBN;
  public static final String STEER_BR_CBN = SWERVEPOD_REV_CBN;
}
