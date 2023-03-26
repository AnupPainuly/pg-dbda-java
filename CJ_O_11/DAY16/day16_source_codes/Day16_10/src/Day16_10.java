// Method reference to constructor

@FunctionalInterface
interface MyInterface
{
	Hello display(String str);
}

class Hello
{
	public Hello(String str)
	{
		System.out.println(str);
	}
}

public class Day16_10 
{
	public static void main(String[] args)
	{
		MyInterface ref = Hello::new;
		ref.display("Sunbeam Infotech");
		

	}

}
