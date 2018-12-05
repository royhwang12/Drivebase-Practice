/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class DriveBase extends Subsystem {
  private Spark leftMotor;
  private Spark rightMotor;
  
  public DriveBase() {
    leftMotor = new Spark(RobotMap.LEFT_MOTOR.value);
    rightMotor = new Spark(RobotMap.RIGHT_MOTOR.value);
  }

  public void setRaw(double leftValue, double rightValue) {
    leftMotor.set(leftValue);
    rightMotor.set(rightValue);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TankDrive());
  }
}
