package threads1;

public class NewThread extends Thread {
	public NewThread(String name) {
		super(name);
	}//ctor to create a named thread
	@Override //override run() to supply B.L of the thread
	public void run()
	{
		System.out.println(getName()+" strted");
		try {
			//B.L : for-loop
			for(int i=0;i<10;i++)
			{
				System.out.println(getName()+" exec counter "+i);
				Thread.sleep(500);//causes invoker thrd to block 
			}
			
		} catch (Exception e) {
			System.out.println(getName()+" got error "+e);
		}
		System.out.println(getName()+" over");
	}
}
