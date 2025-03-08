// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package team3176.robot.constants;

public class DriveConstants {
  public int SERIAL;
  public int THRUST_CID;
  public String THRUST_CBN;
  public int AZIMUTH_CID;
  public String AZIMUTH_CBN;
  public int CANCODER_CID;
  public String CANCODER_CBN;
  public double OFFSET;

  public static double SWERVEPOD_AZIMUTH_REDUCTION = (150.0 / 7.0);
  public static double SWERVEPOD_AZIMUTH_CURRENTLIMIT = 80;
  public static boolean SWERVEPOD_AZIMUTH_INVERTED = true;
  public static boolean SWERVEPOD_ENCODER_INVERTED = false;

  public static double SWERVEPOD_THRUST_REDUCTION = (50.0 / 14.0) * (16.0 / 28.0) * (45.0 / 15.0);
  public static double SWERVEPOD_THRUST_CURRENTLIMIT = 80;
  public static boolean SWERVEPOD_THRUST_INVERTED = true;

  DriveConstants() {}
}
