package p1;

public class NetworkPrinter implements Printer
{

	public void print(String msg) 
	{
		System.out.println("Inside Network Printer "+msg);		
	}

	public void m1() // added one more functionality  //allowed 
	{
		System.out.println("Inside network printer class m1 method ");
	}
}
