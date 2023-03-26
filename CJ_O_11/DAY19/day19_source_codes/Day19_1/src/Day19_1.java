
class Demo implements Runnable
{
	Thread t; //field of class Demo ==> null
	String str;
	Demo(String str)
	{
		this.str=str;
	}
	
	@Override
	public void run()
	{
		System.out.println("Thread name = "+str);
		try
		{
		for(int i=0;i<5;i++)
			System.out.println(i);	
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	
	
	public void start()
	{
		System.out.println("Strating the thread");
		if(t == null)
		{
			t=new Thread(this,str); //(dobj1,"FirstThread") //(dobj2,"SecondThread")
			t.start(); //will search for run() 
			
		}
	}
	
}

public class Day19_1 {

	public static void main(String[] args) 
	{
		Demo dobj1=new Demo("FirstThread");
		dobj1.start(); //start() is called upon dobj1 ==>this==> dobj1
		Demo dobj2=new Demo("SecondThread");
		dobj2.start();//start() is called upon dobj2 ==>this==> dobj2
	}

}
