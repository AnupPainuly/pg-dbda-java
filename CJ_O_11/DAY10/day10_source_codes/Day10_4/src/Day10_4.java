import java.util.InputMismatchException;
import java.util.Scanner;

// it is compulsory to write generic catch block 
//after the other catch blocks 
// javac error : code becomes unreachable

public class Day10_4 {

	public static void main(String[] args) 
	{
		int num1,num2;
		int result;
		Scanner sc=new Scanner(System.in);
		try
		{
			String s1 = args[0];
	
		
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
		catch(Exception e)
		{
			System.out.println("please check input supplied ");
		}
		
		
	}

}