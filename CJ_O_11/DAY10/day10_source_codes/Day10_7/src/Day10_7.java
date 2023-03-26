

//Example of Unchecked Exception

public class Day10_7 {

	public static void main(String[] args) 
	{
		try
		{
			int num = Integer.parseInt("1234abcd");
			System.out.println("Num = "+num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Input supplied is not correct");
		}
	}
}



/*
public class Day10_7 {

	public static void main(String[] args) 
	{
		int num = Integer.parseInt("1234abcd"); // throw NFE 
		// since we have not handled it, JVM will handle this
		// NFE is unchecked exception
		// for unchecked exception there is no javac error 
	
		System.out.println("Num = "+num);

	}

}
*/