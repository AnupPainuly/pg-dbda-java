
public class Day9_6 
{   
	static<T> void display(T element)
	{
		System.out.println("Value = "+element);
	}
	
	public static void main(String[] args) 
	{
		display(123); //123 ===> int ==> Integer ==> Autoboxing
		display(9.5);
		display("Sunbeam");
	}

}






