package team3176.robot.subsystems.vision;

import org.littletonrobotics.junction.AutoLog;
import org.photonvision.PhotonCamera;
import org.photonvision.common.dataflow.structures.Packet;
import org.photonvision.targeting.PhotonPipelineResult;

import com.playingwithfusion.TimeOfFlight;

public class TimeOfFlightIO {
  private TimeOfFlight tof;

  @AutoLog
  public static class PhotonCameraInputs {
    byte[] rawBytes = new byte[1];
    boolean isConnected = false;
    double timestamp = 0.0;
  }

  public TimeOfFlightIO(int id) {
    this.tof = new TimeOfFlight(id);
    // PhotonPipelineResult.serde.pack(packet, new PhotonPipelineResult());
  }

  public void updateInputs(PhotonCameraInputs inputs) {
      double result = this.tof.getRange();
    }

  public TimeOfFlight getTimeOfFlight() {
    return this.tof;
  }

  public double getdistance()
  {
    return this.tof.getRange();
  }
}
