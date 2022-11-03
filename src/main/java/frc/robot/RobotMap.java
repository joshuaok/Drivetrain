package frc.robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class RobotMap {
    public static final int LEFT_FRONT_DRIVE_PORT = 3;
    public static final int RIGHT_FRONT_DRIVE_PORT = 4;
    public static final int LEFT_BACK_DRIVE_PORT = 1;
    public static final int RIGHT_BACK_DRIVE_PORT = 2;
    
    public static WPI_TalonFX leftFrontDrivePort= new WPI_TalonFX(Left_front_drive_port);
    public static WPI_TalonFX rightFrontDrivePort= new WPI_TalonFX(Right_front_drive_port);
    public static WPI_TalonFX leftBackDrivePort= new WPI_TalonFX(Left_back_drive_port);
    public static WPI_TalonFX rightBackDrivePort= new WPI_TalonFX(Right_back_drive_port);
}
