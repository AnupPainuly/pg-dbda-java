
//static methods 
class Test
{
	void m1() //non static method 
	{
		System.out.println("Inside the method m1");
	}
	static void sum(int n1,int n2) //static method 
	{
		System.out.println("Addition = "+(n1+n2));
	}
	static void sub(int n1,int n2) // static method 
	{
		System.out.println("Subtraction = "+(n1-n2));
	}
}

public class Day4_12 
{

	public static void main(String[] args) 
	{
		Test tobj=new Test();
		tobj.m1();
		//tobj.sum(15, 4); //allowed //not recommended
		//tobj.sub(20,5); // allowed  // non recommended
		// warning : static methods can be called in a static way 
		
		//static methods must be called with the help of classname.methodname  
		Test.sum(80, 30);
		Test.sub(60, 20);

	}

}
