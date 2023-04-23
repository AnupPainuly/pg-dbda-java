package threads2;

//RunnableTask IS NOT a Thread , it IS-A Runnable 
public class RunnableTask implements Runnable {
	
	@Override //override run() to supply B.L of the thread
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" strted");
		try {
			//B.L : for-loop
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+" exec counter "+i);
				Thread.sleep(500);//causes invoker thrd to block 
			}
			
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got error "+e);
		}
		System.out.println(Thread.currentThread().getName()+" over");
	}
}
