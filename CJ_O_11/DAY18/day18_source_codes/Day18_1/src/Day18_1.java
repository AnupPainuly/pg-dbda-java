
public class Day18_1 {

	public static void main(String[] args) 
	{
		Thread th = Thread.currentThread();
		System.out.println("Th = "+th);
		System.out.println("Get Name = "+th.getName());
		System.out.println("Get Class = "+th.getClass());
		System.out.println("Priority = "+th.getPriority());
		System.out.println("State = "+th.getState().name());
		System.out.println("is daemon = "+th.isDaemon());
		System.out.println("is alive = "+th.isAlive());
		
	}
}




/*
public class Day18_1 {

	public static void main(String[] args) 
	{
		Thread th = Thread.currentThread();
		System.out.println(th);
		//th.toString()
		//the thread's name, priority, and thread group.
	}

}
*/