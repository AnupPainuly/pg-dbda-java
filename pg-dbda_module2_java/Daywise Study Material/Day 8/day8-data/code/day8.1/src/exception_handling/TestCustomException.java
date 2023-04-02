package exception_handling;

import java.util.Scanner;

import custom_exceptions.SpeedOutOfRangeException;

import static utils.ValidationRules.validateSpeed;

public class TestCustomException {

	public static void main(String[] args) /* throws SpeedOutOfRangeException */ {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			System.out.println("end of try....");
		} 
		catch (Exception e) {
		//	System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
