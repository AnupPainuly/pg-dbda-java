
class Test
{
	public Test()
	{
		System.out.println("Inside the class Test Constructor");
	}
	
	public void disp()
	{
		System.out.println("inside class Test disp method");
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Inside Finalize method");
		Thread th=Thread.currentThread();
		System.out.println("Name = "+th.getName());
		System.out.println("Priority = "+th.getPriority());
		System.out.println("Group name = "+th.getThreadGroup());
		System.out.println("State = "+th.getState().name());
		System.out.println("Alive =  "+th.isAlive());
		System.out.println("Deamon = "+th.isDaemon());
	}
}

public class Day18_3 
{

	public static void main(String[] args)
	{
		Test tobj = new Test();
		tobj.disp();
		tobj.finalize();
		tobj=null;
		System.gc(); // Request to invoke garbage collector 

	}

}
