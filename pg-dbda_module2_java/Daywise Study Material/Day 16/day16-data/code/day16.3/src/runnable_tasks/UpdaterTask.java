package runnable_tasks;

import com.app.core.JointAccount;

public class UpdaterTask implements Runnable {
	//state
	//shared resource : eg : joint account
	private JointAccount jointAcct;
	

	public UpdaterTask(JointAccount jointAcct) {
		super();
		this.jointAcct = jointAcct;
		System.out.println("ctor invoked by "+Thread.currentThread().getName());//main
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" strted");
		try {
			//This task will be attached to customer 1 , represented by a thread
			//cust 1: wants to update balance.
			while(true)
			{
				synchronized (jointAcct) {
					jointAcct.updateBalance(500);
				}
				
				Thread.sleep(345);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got err "+e);
		}
		System.out.println(Thread.currentThread().getName()+" over");

	}

}
