import java.util.ArrayList;

// getClass() is called from Object class

class Demo
{
	
}
class Day15_5
{

	static void printName(Object o)
	{
		Class c = o.getClass();
		System.out.println(c.getName());
	}
	public static void main(String[] args) throws Exception
	{
		Demo d= new Demo();
		Day15_5 dobj = new Day15_5();
		printName(d);
		printName(dobj);
	}
	
}


/*
// .class file is stored in Class reference for reflection
public class Day15_5 {

	public static void main(String[] args) throws Exception
	{
		Class c = Day15_5.class;
		System.out.println(c.getName());
	}
}
*/


/*
// forName() is used to reflect the class 

public class Day15_5 {

	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName("Day15_5");
		System.out.println(c.getName());
		
	
	}

}
*/