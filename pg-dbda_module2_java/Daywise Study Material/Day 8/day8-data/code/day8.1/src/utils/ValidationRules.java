package utils;

import custom_exceptions.SpeedOutOfRangeException;

public class ValidationRules {
	//public static final
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	//static init block
	static {
		MIN_SPEED=30;
		MAX_SPEED=80;
	}
//add a static method for validating speed of the vehicle
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException
	{
		if(speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow!!!!!!!!!!!!!!");
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Too fast , FATAL !!!!!!");
		System.out.println("speed within range.....");
	}
}
