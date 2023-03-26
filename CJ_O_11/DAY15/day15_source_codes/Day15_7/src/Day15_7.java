class Demo
{
	
}
interface MyInterface
{
	
}

public class Day15_7 
{

	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class c = Class.forName("Demo");
		System.out.println(c.isInterface());
		
		c = Class.forName("MyInterface");
		System.out.println(c.isInterface());
		

	}

}
