//example of override
class Person
{
	void m1()
	{
		
	}
	void disp()
	{
		System.out.println("Inside person class disp");
	}
	
	@Override
	public String toString() {
		return "Person []";
	}
	
	
}

class Employee extends Person
{
	
	void m2() 
	{
		
	}
	@Override
	void disp() 
	{
		super.disp();
		System.out.println("Inside Employee class disp");
	}
}

public class Day15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
