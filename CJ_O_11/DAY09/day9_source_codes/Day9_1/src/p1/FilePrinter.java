package p1;

public class FilePrinter implements Printer
{
	
	public void print(String msg) 
	{
		System.out.println("Inside File Printer Class "+msg);
		System.out.println("Fetching the data directly "+DATA);
	}

}
