package team3176.robot.subsystems.superstructure;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ConditionalCommand;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import java.util.function.DoubleSupplier;
import org.littletonrobotics.junction.AutoLogOutput;
import team3176.robot.FieldConstants;
// import java.util.function.IntSupplier;
import team3176.robot.subsystems.drivetrain.Drivetrain;
import team3176.robot.util.AllianceFlipUtil;
import team3176.robot.util.NoteVisualizer;

public class Superstructure {
  private static Superstructure instance;
  public Superstructure() {
    
  }

  @AutoLogOutput


  /*
  public Command climbDown() {
    return climb.moveLeftRightPosition(0, 0);
  }
  */







  public static Superstructure getInstance() {
    if (instance == null) {
      instance = new Superstructure();
      System.out.println("Superstructure instance created.");
    }
    return instance;
  }
}
