
@FunctionalInterface
interface Name
{
	public String getMyName();
}


public class Day16_5 
{

	public static void main(String[] args) 
	{
		Name nm= () -> {return "Hello everyone";};
		System.out.println(nm.getMyName());

	}

}
