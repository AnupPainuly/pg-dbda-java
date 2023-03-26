class Outer  // Outer.class
{
	Outer()
	{
		System.out.println("Outer class Parameterless Constructor");
	}
	
	class Inner  // Outer$Inner.class
	{
		Inner()
		{
			System.out.println("Inner class constructor");
		}
	}
	
} //scope of outer class

public class Day9_3  //Day9_3.class
{

	public static void main(String[] args) 
	{
		//Outer out = new Outer();
		//Outer.Inner in = out.new Inner();
		
		Outer.Inner in = new Outer().new Inner();
	}

}
