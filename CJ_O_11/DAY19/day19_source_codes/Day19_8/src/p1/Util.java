package p1;

public class Util 
{
	public static void delay(int milli)
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}
}
