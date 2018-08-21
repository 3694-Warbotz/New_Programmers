/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3694.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;

public class Robot extends IterativeRobot {
	//motors
	public static Victor left = new Victor(3);
	public static Victor right = new Victor(1);
	
	//Joysticks
	public static Joystick leftStick = new Joystick(0);
	public static Joystick rightStick = new Joystick(1);

	@Override
	public void robotInit() {
	}

	@Override
	public void autonomousInit() {
	}

	@Override
	public void autonomousPeriodic() {
		left.set(0.75);
		right.set(0.75);
	}

	@Override
	public void teleopPeriodic() {
		left.set(leftStick.getY());
		right.set(rightStick.getY());
	}

	@Override
	public void testPeriodic() {
	}
}
