// yield()
//public static void yield()
//A hint to the scheduler that the current thread is willing to yield 
//its current use of a processor. 

//this method pauses the execution of current thread to execute other thread temporarily


public class Day19_4 extends Thread
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
		Day19_4 t1=new Day19_4();
		Day19_4 t2=new Day19_4();
		
		
		t1.start();
		
		for(int i=0;i<4;i++)
		{
			t1.yield();
		}
		t2.start();
		
		
		

	}

}
