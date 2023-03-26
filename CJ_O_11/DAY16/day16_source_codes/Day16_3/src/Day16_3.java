
//interface Square is having one(single) abstract method 
// that interface is functional interface

/*

@FunctionalInterface
interface Square
{
	public int getArea(int side); // getArea() is an abstract method
	// public int abstract final getArea(int side)
}

// as we are working with lambda inside the class
// so no need to write implements interfacename explicitely

public class Day16_3 
{

	public static void main(String[] args) 
	{
		Square area = (side)->{return side*side;};
		// (side) is a single argument used in lambda expression
		// lambda expression is perfroming side*side and returning its result
		
		System.out.println("Area of Sqaure = "+area.getArea(5));
		System.out.println("Area of square side = 7 "+area.getArea(7));
		System.out.println("Area of square "+area.getArea(4));
	}

	
}

*/



/*
interface Square
{
	public int getArea(int side); 
}

public class Day16_3 implements Square
{

	public int getArea(int side) 
	{
		return side * side;
	}
	public static void main(String[] args) 
	{
		Day16_3 obj = new Day16_3();
		System.out.println(obj.getArea(6));
	}

	
	
}

*/

