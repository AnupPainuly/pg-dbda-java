import java.util.InputMismatchException;
import java.util.Scanner;

public class Day10_3 {

	public static void main(String[] args) 
	{
		int num1,num2;
		int result;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter First Number ");
			num1 = sc.nextInt();
		
			System.out.println("Enter Second Number ");
			num2 = sc.nextInt();
		
			result = num1/num2;
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Second number can't be zero");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Data entered is in wrong pattern");
		}
		
		
	}

}