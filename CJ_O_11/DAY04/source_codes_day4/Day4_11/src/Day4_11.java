
class Test
{
	void m1() //non static method 
	{
		System.out.println("Inside the method m1");
	}
	void sum(int n1,int n2) //non static method 
	{
		System.out.println("Addition = "+(n1+n2));
	}
	void sub(int n1,int n2) //non static method 
	{
		System.out.println("Subtraction = "+(n1-n2));
	}
}

public class Day4_11 
{

	public static void main(String[] args) 
	{
		Test tobj=new Test();
		tobj.m1();
		tobj.sum(5, 4);
		tobj.sub(10,5);
		

	}

}
