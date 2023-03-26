public class Day18_2 
{

	public static void main(String[] args) 
	{
		Thread th=Thread.currentThread();
		System.out.println("Th = "+th);
		System.out.println("Priority = "+th.getPriority());
		th.setPriority(3);
		System.out.println("New Priority = "+th.getPriority());
		System.out.println("Updated priority = "+(th.getPriority()+3));
		//th.setPriority(12); // IllegalArgumentException
		//th.setPriority(0); //// IllegalArgumentException
		//th.setPriority(-2); // IllegalArgumentException
		System.out.println("New Priority = "+th.getPriority());
	}
}




/*
public class Day18_2 {

	public static void main(String[] args) 
	{
		System.out.println("Max = "+Thread.MAX_PRIORITY); //10
		System.out.println("Min = "+Thread.MIN_PRIORITY); //0
		System.out.println("Normal = "+Thread.NORM_PRIORITY); // 5
		// in case of priority higher the number lower the priority is
		// th1 ==> 4 ==> higher priority
		// th2 ==> 7 ==> lower priority
		
	}
}
*/


/*
public class Day18_2 {

	public static void main(String[] args) 
	{
		Thread th=Thread.currentThread();
		System.out.println("Th = "+th);
		System.out.println("Priority of th = "+th.getPriority());
		th.setPriority(2);
		System.out.println("Priority of th = "+th.getPriority());
	}

}
*/
