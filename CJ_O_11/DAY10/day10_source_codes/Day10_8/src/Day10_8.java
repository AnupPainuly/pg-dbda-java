//example of checked exception



/*
// use throws keyword to handle checked exception
// throws is used for delegation
// it can be used in front of method names
// throws indicates that caller of the program will handle the exception

public class Day10_8 {

	public static void main(String[] args)  throws InterruptedException
	{
			System.out.println("Java Programming");
			Thread.sleep(5000); 
			//sleep() is called from main()
			
			System.out.println("Topic Exception handling");
		
	}
}
*/

/*
// to handle the checked exception , we have added try and catch block 
public class Day10_8 {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Java Programming");
			Thread.sleep(5000); 
			System.out.println("Topic Exception handling");
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception is handled");	
		}
	}
}

*/



/*
public class Day10_8 {

	public static void main(String[] args) 
	{
		System.out.println("Java Programming");
		Thread.sleep(2000); //javac error Unhandled Exception
		System.out.println("Topic Exception handling");
	}

}

*/
