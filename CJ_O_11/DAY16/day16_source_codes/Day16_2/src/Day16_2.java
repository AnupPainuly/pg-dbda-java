import java.util.Arrays;
import java.util.List;

// capturing the local variable data inside the lambda expression
public class Day16_2 {

	public static void main(String[] args)
	{
		int value=25;
		List<Integer> l1 = Arrays.asList(10,20,30,40);
		l1.forEach(x ->System.out.print(x+value+"\t"));
		
	}
}




/*
//lambda expression having local variable

public class Day16_2 {

	public static void main(String[] args)
	{
		List<Integer> l1 = Arrays.asList(10,20,30,40);
		// y is local variable declared inside lambda expression
		l1.forEach(x -> {
			int y = x*2;
			System.out.print(y+" \t ");
		});
	}
}

*/

/*
//multi line lambda expression
//take each element from the list and add 2 to each element 

public class Day16_2 {

	public static void main(String[] args)
	{
		List<Integer> l1 = Arrays.asList(11,22,33,44);
		// Iterate through the l1 list using forEach 
		// perform adding 2 to each element and then print it
		l1.forEach(x -> {
			x+= 2; 
			System.out.println(x);
		});
	}
}
*/


/*
// example of lambda expressions (single line lambda expression)

public class Day16_2 {

	public static void main(String[] args)
	{
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		System.out.println(l1);
		System.out.println("Printing using for loop : Imperative");
		for(int i = 0 ;i<l1.size();i++)
			System.out.println(l1.get(i));
		System.out.println();
		for(Integer i : l1)
			System.out.println(i);
		
		System.out.println("Printing using for lambda : Declarative");
		l1.forEach(x -> System.out.println(x)); // lambda expression
		
		
		
	}

}

*/
