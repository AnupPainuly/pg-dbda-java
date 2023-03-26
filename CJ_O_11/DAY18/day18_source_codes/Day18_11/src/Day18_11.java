class EvenNumbers implements Runnable
{
	
	@Override
	public void run()
	{
		for(int i=0;i<10;i+=2)
		{
			System.out.println("Even Number = "+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}


class OddNumbers implements Runnable
{
	
	@Override
	public void run()
	{
		for(int i=1;i<10;i+=2)
		{
			System.out.println("Odd Number = "+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}



public class Day18_11 {

	public static void main(String[] args) 
	{
		EvenNumbers eobj=new EvenNumbers();
		OddNumbers oobj=new OddNumbers();
		System.out.println("Eobj = "+eobj);
		System.out.println("oobj = "+oobj);
		Thread t1=new Thread(eobj);
		Thread t2=new Thread(oobj);
		
		t1.start();
		t2.start();
	}

}