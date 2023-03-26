


/*
// ... indicates variable argument method
public class Day6_2 
{
	public static void main(String... args) // valid syntax for main()
	{
		String fname = args[0];
		String lname=args[1];
		
	}

}
*/


/*

public class Day6_2 {

	
	static void sum(int... arguments) //Variable arguments 
	{
		int result = 0;
		for(int ele : arguments)
			result = result + ele;
		System.out.println("Result = "+result);
	}
	public static void main(String[] args) 
	{
		sum(); // 0 Arguments
		sum(10,20); // 2 Arguments ==> 10  = arguments[0]  20 = argument[1] 
		sum(10,20,30); // 2 Arguments
		sum(9,6,3,2); //4 Arguments
		

	}

}

*/


/*
public class Day6_2 {

	static void sum(int a,int b)
	{
		System.out.println("Addition = "+(a+b));
	}
	static void sum(int a,int b,int c)
	{
		System.out.println("Addition = "+(a+b+c));
	}
	public static void main(String[] args) 
	{
		sum(10,20);
		sum(10,20,30);
		

	}

}
*/