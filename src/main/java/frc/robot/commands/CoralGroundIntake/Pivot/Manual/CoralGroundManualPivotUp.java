// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.CoralGroundIntake.Pivot.Manual;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CoralGroundIntakeSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class CoralGroundManualPivotUp extends Command {
  private CoralGroundIntakeSubsystem m_CoralGroundIntakeSubsystem;
  /** Creates a new CoralGroundIntakePivotUp. */
  public CoralGroundManualPivotUp(CoralGroundIntakeSubsystem coralGroundIntakeSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_CoralGroundIntakeSubsystem = coralGroundIntakeSubsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_CoralGroundIntakeSubsystem.intakePivotUp();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_CoralGroundIntakeSubsystem.intakePivotStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
