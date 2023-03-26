// stop()
// it is used to stop the execution of current thread
// once the thread is stopped , it can not be resumed 

public class Day19_6 extends Thread
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
		Day19_6 t1=new Day19_6();
		Day19_6 t2=new Day19_6();
		Day19_6 t3=new Day19_6();
		
		t1.start();
		t2.start();
		t1.stop();
		t3.start();
		
		
		

	}

}
