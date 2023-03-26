class Machine
{
	public void start()
	{
		System.out.println("Machine started");
	}
}

class Laptop extends Machine
{
	public void start()
	{
		super.start();
		System.out.println("Laptop Started");
	}
	public void stop()
	{
		System.out.println("Laptop stopped");
	}
}
public class Day8_3 {

	public static void main(String[] args)
	{
		Machine mobj=new Machine(); //mobj ==> super class object
		//mobj.start(); //allowed 
		//mobj.stop(); // not allowed 
		
		Laptop lobj=new Laptop();
		//lobj.start(); //allowed
		//lobj.stop(); //allowed 
		
		// UPCASTING
		// we assign the child class reference to parent class
		
		Machine m2=lobj;
		//m2.start();
		
		Machine m3=new Laptop(); // Upcasting
		//m3.start(); //we can call only overridden methods 
		//m3.stop(); // javac error // stop() is non overridden method 
		
		
		Laptop l1 = (Laptop)m3; // Downcasting
		l1.start();
		l1.stop();
		

	}

}
