class EvenNumbers extends Thread
{
	EvenNumbers(String str)
	{
		this.setName(str);
	}
	@Override
	public void run()
	{
		for(int i=0;i<10;i+=2)
		{
			System.out.println("Even Number = "+i);
			
		}
	}
}


class OddNumbers extends Thread
{
	OddNumbers(String str)
	{
		this.setName(str);
	}
	@Override
	public void run()
	{
		for(int i=1;i<10;i+=2)
		{
			System.out.println("Odd Number = "+i);
			
		}
	}
}



public class Day18_8 {

	public static void main(String[] args) 
	{
		EvenNumbers eobj=new EvenNumbers("EVEN THREAD");
		System.out.println("Eobj = "+eobj);
		OddNumbers oobj=new OddNumbers("ODD THREAD");
		System.out.println("oobj = "+oobj);
		eobj.start();
		oobj.start();
	}

}
