import java.util.Scanner;


public class Day10_2 {

	public static void main(String[] args) 
	{
		int num1,num2;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second Number ");
		num2 = sc.nextInt();
		try
		{
			result = num1/num2;
			System.out.println("Result = "+result);
		}
		catch(Exception e)
		{
			System.out.println("Second number can't be zero");
		}
		
		
	}

}



/*
public class Day10_2 {

	public static void main(String[] args) 
	{
		int num1,num2;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second Number ");
		num2 = sc.nextInt();
		try
		{
			result = num1/num2;
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Second number can't be zero");
		}
		
		
	}

}


*/
