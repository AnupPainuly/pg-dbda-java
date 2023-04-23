package tester;

import com.app.core.JointAccount;

import runnable_tasks.CheckBalanceTask;
import runnable_tasks.UpdaterTask;

public class TestSharedResource {

	public static void main(String[] args) throws InterruptedException{
		// create joint acct instance
		JointAccount acct=new JointAccount(5000);
		//create thrds(customers) by attaching tasks
		Thread t1=new Thread(new UpdaterTask(acct), "customer1");
		Thread t2=new Thread(new CheckBalanceTask(acct), "customer2");
		t1.start();
		t2.start();//3 thrds 
		System.out.println("waiting for child thrds....");
		t1.join();
		t2.join();
		System.out.println("main over...");
		

	}

}
