import java.util.Scanner;

// take one input as a number from user
// if number is greater than 100 throw the exception
// name of the exception NumberIsGreaterException

class NumberIsGreaterException extends Exception
{
	NumberIsGreaterException()
	{
		System.out.println("user exception");
	}
}


public class Day10_11 {

	public static void main(String[] args) 
	{
		try
		{
			int num;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number = ");
			num=sc.nextInt();
			if(num>=100)
			{
				throw new NumberIsGreaterException();
			}
			System.out.println("Num = "+num);
		}
		catch(NumberIsGreaterException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("end of the code");
		}
	}

}
