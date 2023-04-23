package runnable_tasks;

import com.app.core.JointAccount;

public class CheckBalanceTask implements Runnable {
	// state
	// shared resource : eg : joint account
	private JointAccount jointAcct;

	public CheckBalanceTask(JointAccount jointAcct) {
		super();
		this.jointAcct = jointAcct;
		System.out.println("ctor invoked by " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			// This task will be attached to customer 2 , represented by a thread
			// cust 2: wants to check balance.
			while (true) {
				synchronized (jointAcct) {
					double balance = jointAcct.checkBalance();
					if (balance != 5000) {
						System.out.println("ERROR!!!!!!!!!!!!!!!!!!!");
						System.exit(-1);
					}
				}

				Thread.sleep(123);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
