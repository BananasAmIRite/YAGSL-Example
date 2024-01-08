package frc.robot.subsystems.intake;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.apriltag.AprilTagFields;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
    private CANSparkMax intake = new CANSparkMax(Constants.IntakeConstants.intakeId, MotorType.kBrushless); 
    
    public Intake() {
        intake.setSmartCurrentLimit(40); 
        intake.setInverted(false); 
        intake.setIdleMode(IdleMode.kBrake);
    }

    public Command intakeIn(double power) {
        return Commands.runOnce(() -> {
        }, this); 
    }

    public Command intakeOut(double power) {
        return Commands.runOnce(() -> {
        }, this); 
    }

    public Command stop() {
        return Commands.runOnce(() -> {
        }, this); 
    }

    @Override
    public void periodic() {
        SmartDashboard.putNumber("intake speed", this.intake.get()); 
    }
}