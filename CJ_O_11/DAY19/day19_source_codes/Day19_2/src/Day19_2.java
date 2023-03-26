class ThreadGroupDemo implements Runnable
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread());
		
	}
}

public class Day19_2 
{

	public static void main(String[] args) 
	{
		ThreadGroupDemo robj=new ThreadGroupDemo();
		ThreadGroup tg1=new ThreadGroup("Group1");
		
		Thread t1=new Thread(tg1,robj,"First Thread-G1");
		t1.start();
		Thread t2=new Thread(tg1,robj,"Second Thread-G1");
		t2.start();
		Thread t3=new Thread(tg1,robj,"Third Thread-G1");
		t3.start();

		ThreadGroup tg2=new ThreadGroup("Group2");
		Thread t4=new Thread(tg2,robj,"First Thread-G2");
		t4.start();
		Thread t5=new Thread(tg2,robj,"Second Thread-G2");
		t5.start();
		Thread t6=new Thread(tg2,robj,"Third Thread-G2");
		t6.start();
	}

}
