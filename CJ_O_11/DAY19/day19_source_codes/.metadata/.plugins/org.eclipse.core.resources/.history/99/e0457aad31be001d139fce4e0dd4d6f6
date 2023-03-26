// join() example
// it causes current thread to block until the second thread terminates
// or the specified amount of milliseconds passes
//public final void join() throws InterruptedException
//Waits for this thread to die.

public class Day19_3 extends Thread
{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i+" "+this.getName());
		}
	}
	public static void main(String[] args)
	{
		Day19_3 t1=new Day19_3();
		Day19_3 t2=new Day19_3();
		Day19_3 t3=new Day19_3();
		
		t1.start();
		
		try 
		{
			t1.join();
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		

	}

}
