package threads3;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());// main: thrd name ,5: priority main: thrd grp
		// create child threads
		RunnableTask task = new RunnableTask();
		// ctor to be used for implements Runnable : named thrd
		// Thread(Runnable instance,String name)
		Thread t1 = new Thread(task, "one");
		Thread t2 = new Thread(task, "two");
		Thread t3 = new Thread(task, "three");
		Thread t4 = new Thread(task, "four");
		t1.start();
		t2.start();
		t3.start();
		t4.start();// Runnable : 1(m) + 4 child thrds
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec counter " + i);
			Thread.sleep(100);// causes invoker thrd to block
		}
		System.out.println("main waiting for child thrds to complete exec");
		t1.join();// main is waiting for t1 to complete exec
		t2.join();// main is waiting for t2 to complete exec
		t3.join();// main is waiting for t3 to complete exec
		t4.join();// main is waiting for t4 to complete exec
		System.out.println("main over.....");//ensuring no orphans!

	}

}
