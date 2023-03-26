// suspend() and resume()
// it suspends the currently running thread temporarily
// using resume method you can resume the suspended thread

//resume() is used for resuming the ssuspended thread.
// it is only used when you use suspend()

public class Day19_5 extends Thread
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
		Day19_5 t1=new Day19_5();
		Day19_5 t2=new Day19_5();
		Day19_5 t3=new Day19_5();
		
		t1.start();
		t2.start();
		t1.suspend();
		t3.start();
		t1.resume();
		
		
		

	}

}
