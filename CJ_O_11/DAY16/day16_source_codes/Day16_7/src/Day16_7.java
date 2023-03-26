// Method Reference to an instance method of an object

@FunctionalInterface
interface MyInterface
{
	void display();
}



public class Day16_7 
{

	public void m1()
	{
		System.out.println("Inside M1 Method");
	}
	
	public void m2()
	{
		System.out.println("Inside M2 Method");
	}
	
	public static void main(String[] args)
	{
		Day16_7 obj=new Day16_7();
		MyInterface ref = obj::m1;
		// calling the method of functional interface
		ref.display();
		ref = obj::m2;
		ref.display();

	}

}
