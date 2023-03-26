// Method Reference to an instance method of an object

@FunctionalInterface
interface MyInterface
{
	void execute(int a,int b);
}


class Demo
{
	void test(int v1,int v2)
	{
		System.out.println("V1 = "+v1+" V2 = "+v2);
	}
}


public class Day16_8 
{

	public void add(int n1,int n2)
	{
		System.out.println("Inside Addition Method = "+(n1+n2));
	}
	
	public void sub(int n1,int n2)
	{
		System.out.println("Inside subtraction Method = "+(n1-n2));
	}
	public void mul(int n1,int n2)
	{
		System.out.println("Inside Multiplication Method = "+(n1*n2));
	}
	public void div(int n1,int n2)
	{
		System.out.println("Inside Division Method = "+(n1/n2));
	}
	
	public static void main(String[] args)
	{
		Day16_8 obj=new Day16_8();
		MyInterface ref = obj::add;
		ref.execute(5, 2);

		ref=obj::sub;
		ref.execute(9, 3);
		
		ref=obj::mul;
		ref.execute(20, 15);
		
		ref=obj::div;
		ref.execute(60, 5);
		
		
		Demo dobj=new Demo();
		ref =dobj::test;
		ref.execute(99,88);
		
	}

}
