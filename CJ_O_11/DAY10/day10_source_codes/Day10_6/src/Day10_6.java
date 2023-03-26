import java.util.InputMismatchException;
import java.util.Scanner;


public class Day10_6 {

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
		
		catch(Exception e)
		{
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("Finally block gets executed");
		}
		
	}

}




/*
//try block handler


public class Day10_6 {

	public static void main(String[] args) 
	{
		int num1,num2;
		int result;
		
		//try block handler 
		//when we deal with resources 
		// when we want resource to be closed on its own if exception have occurred 
		
		try(Scanner sc = new Scanner(System.in))
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
			System.out.println(" exception handled ");
		}
		
	}
}
	
*/


	
/*

public class Day10_6 {

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
		
		catch(ArithmeticException | InputMismatchException e)  
		{
			System.out.println("please check the details again ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{}
		catch(Exception e)
		{}
		
	}

}
*/
