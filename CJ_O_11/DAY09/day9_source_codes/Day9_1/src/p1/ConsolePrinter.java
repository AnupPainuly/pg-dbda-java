package p1;

public class ConsolePrinter implements Printer 
{
	public void print(String msg)
	{
		System.out.println("Inside Console Printer "+msg);
	}
}
