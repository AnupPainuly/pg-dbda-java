

class Count implements Runnable
{
	Thread th;
	Count()
	{
		th=new Thread(this,"MY-THREAD");
		System.out.println("Inside Count class"+th+" "+this);
		th.start();
		
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}
	}
}


public class Day18_10
{
	public static void main(String args[])
	{
		Count cobj=new Count();
	}
}



/*
class Count implements Runnable
{
	Thread th;
	Count()
	{
		th=new Thread(this);
		System.out.println("Inside Count class"+th);
		th.start();
		
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}
	}
}


public class Day18_10
{
	public static void main(String args[])
	{
		Count cobj=new Count();
	}
}


*/