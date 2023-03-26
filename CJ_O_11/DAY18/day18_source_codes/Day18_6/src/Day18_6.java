
class Count extends Thread 
{
	Count()
	{
		System.out.println("Inside count class constructor "+this);
		start(); //this.start()
	}
	
	@Override
	public void run()
	{
		for(int i =0;i<10;i++)
		{
			System.out.println("Count  = "+i+" \t "+this);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Thread object run method is over");
	}
}

public class Day18_6 {

	public static void main(String[] args) 
	{
		Count cobj1=new Count(); //cobj is thread object
		Count cobj2=new Count();
		try
		{
			while(cobj1.isAlive() || cobj2.isAlive())
			{
				System.out.println("Main thread");
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Main Thread is over");
	}

}

// first thread ==> main
// second thread ==> gc
//third thread ==> cobj1
//fourth thread ==> cobj2

