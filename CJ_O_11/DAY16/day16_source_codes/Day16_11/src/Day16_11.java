import java.util.Arrays;
import java.util.List;

public class Day16_11 {

	public static void main(String[] args) 
	{
		List<Integer> l1=Arrays.asList(10,20,30,40,50);
		System.out.println("Printing data using lambda");
		l1.forEach(x -> System.out.print(x+"\t"));
		
		System.out.println("\n Printing data using method reference");
		l1.forEach(System.out :: println);

	}

}
