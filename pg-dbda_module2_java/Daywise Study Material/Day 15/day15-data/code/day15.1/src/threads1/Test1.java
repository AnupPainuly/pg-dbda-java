package threads1;

public class Test1 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread());// main: thrd name ,5: priority main: thrd grp
		//create child threads
		NewThread t1=new NewThread("one");
		NewThread t2=new NewThread("two");
		NewThread t3=new NewThread("three");
		NewThread t4=new NewThread("four");//Runnable : 1
		t1.start();
		t2.start();
		t3.start();
		t4.start();//Runnable : 1(m) + 4 child thrds
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" exec counter "+i);
			Thread.sleep(1000);//causes invoker thrd to block 
		}
		System.out.println("main over.....");

	}

}
