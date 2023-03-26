import java.util.Scanner;

//eg. 12345 number
// reverse it ===> 54321


public class Day7_5 
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter Number ");
		num = sc.nextInt();
		//int to String
		String str = String.valueOf(num); // Boxing 
		// 12345 ===> "12345" 
		
		//String to StringBuffer
		System.out.println("Str = "+str);
		StringBuffer sb1=new StringBuffer(str);
		System.out.println("Sb1 = "+sb1);
		sb1.reverse();
		System.out.println("Sb1 = "+sb1);
	}
}


/*
public class Day7_5 {

	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("sunbeam"); 
		sb1.reverse();
		System.out.println("Reverse String = "+sb1);
	}
}
*/



/*
public class Day7_5 {

	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("sunbeam"); 
		StringBuffer sb2=new StringBuffer("sunbeam"); 
		System.out.println("sb1 == sb2 "+(sb1==sb2)); //false 
		System.out.println("sb1.equals sb2 "+(sb1.equals(sb2))); //false
		System.out.println("sb1 hashcode = "+sb1.hashCode());
		System.out.println("sb2 hashcode = "+sb2.hashCode());
	}
}
*/




/*
public class Day7_5 {

	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("hello"); // mutable set of characters 
		System.out.println("Sb1 = "+sb1);
		System.out.println("sb1 = "+sb1.append(" everyone"));
		System.out.println("sb1 = "+sb1);

	}

}
*/



/*
public class Day7_5 {

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder("sunbeam"); 
		StringBuilder sb2=new StringBuilder("sunbeam"); 
		System.out.println("sb1 == sb2 "+(sb1==sb2)); //false 
		System.out.println("sb1.equals sb2 "+(sb1.equals(sb2))); //false
		System.out.println("sb1 hashcode = "+sb1.hashCode());
		System.out.println("sb2 hashcode = "+sb2.hashCode());
	}
}

*/


/*
public class Day7_5 {

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder("hello"); // mutable set of characters 
		System.out.println("Sb1 = "+sb1);
		System.out.println("sb1 = "+sb1.append(" everyone"));
		System.out.println("sb1 = "+sb1);

	}

}

*/
