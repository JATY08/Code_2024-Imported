// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package team3176.robot.constants;

public class SwervePodHardwareID {
  public int SERIAL;
  public int THRUST_CID;
  public String THRUST_CBN;
  public int AZIMUTH_CID;
  public String AZIMUTH_CBN;
  public int CANCODER_CID;
  public String CANCODER_CBN;
  public double OFFSET;
  public boolean INVERT;
  // public podPosition POD_POSITION;

  SwervePodHardwareID() {}

  SwervePodHardwareID(
      int thrust_cid,
      String thrust_cbn,
      int azimuth_cid,
      String azimuth_cbn,
      int cancoder_cid,
      String cancoder_cbn,
      double offset,
      boolean invert) {
    this.THRUST_CID = thrust_cid;
    this.THRUST_CBN = thrust_cbn;
    this.AZIMUTH_CID = azimuth_cid;
    this.AZIMUTH_CBN = azimuth_cbn;
    this.CANCODER_CID = cancoder_cid;
    this.CANCODER_CBN = cancoder_cbn;
    this.OFFSET = offset;
    this.INVERT = invert;
  }

  SwervePodHardwareID(
      int serial,
      int thrust_cid,
      String thrust_cbn,
      int azimuth_cid,
      String azimuth_cbn,
      int cancoder_cid,
      String cancoder_cbn,
      double offset,
      boolean invert) {
    this.THRUST_CID = thrust_cid;
    this.THRUST_CBN = thrust_cbn;
    this.AZIMUTH_CID = azimuth_cid;
    this.AZIMUTH_CBN = azimuth_cbn;
    this.CANCODER_CID = cancoder_cid;
    this.CANCODER_CBN = cancoder_cbn;
    this.SERIAL = serial;
    this.OFFSET = offset;
    this.INVERT = invert;
  }

  enum podPosition {
    FL,
    FR,
    BL,
    BR
  }

  public static boolean check_duplicates(SwervePodHardwareID a, SwervePodHardwareID b) {
    boolean are_duplicates = (a.CANCODER_CID == b.CANCODER_CID) | (a.THRUST_CID == b.THRUST_CID);
    return are_duplicates;
  }

  public static boolean check_duplicates_all(
      SwervePodHardwareID a, SwervePodHardwareID b, SwervePodHardwareID c, SwervePodHardwareID d) {
    return check_duplicates(a, b)
        | check_duplicates(a, c)
        | check_duplicates(a, d)
        | check_duplicates(b, c)
        | check_duplicates(b, d)
        | check_duplicates(c, d);
  }

  /*
    public void setPodPosition (String podPosition) {
      this.POD_POSITION = podPosition.equals("FL") ? podPosition.FL : podPosition.equals("FR") ? podPosition.FR : podPosition.equals("BL") ? podPosition.BL : podPosition.BR;
    }

    public void setPodPosition (int podPosition) {
      this.POD_POSITION = podPosition.equals("FL") ? setPodPosition.FL : podPosition.equals("FR") ? podPosition.FR : podPosition.equals("BL") ? podPosition.BL : podPosition.BR;
    }
  */

  /*
  public String getPodPosition() {
    return this.POD_POSITION.toString();
  }
  */

}
