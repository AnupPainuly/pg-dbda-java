
// Variables demo
// In java mentioning of data types for variables is compulsory
// it is called as STATICALLY TYPE CHECKED LANGUAGE 

// difference between field VS local variable
class Day2_4
{
	int a; // field of class DAy2_4 // data member 
	
	public static void main(String[] args) 
	{
		int n1=30; // n1 is local variable to main()
		//OR // n1 is main method local variable
		// local variable / method local variable 
		float f = 5.5f; // local variable 
		System.out.println("N1 "+n1);
		System.out.println("Float value = "+f);
		
		
	}
}






/*
//N1 = 30  
// N2 = 25
public class Day2_4 {

	public static void main(String[] args) 
	{
		int n1=30;
		int n2=25;
		System.out.println("N1 = "+n1); // java
		// + is used for concatination
		
		//printf("N1 = %d",n1); //C 
		//cout<<"N1 = "<<n1; // C++ 
		
		
		System.out.println("N2 = "+n2); // java
		
		// Output : Num1 = 30  and Num2 = 25
		System.out.println("Num1 = "+n1+" and "+" Num2 = "+n2);
		
	}

}
*/


/*
public class Day2_4 {

	public static void main(String[] args) 
	{
		int num; //variable declaration
		num=35; // variable definition
		System.out.println(num); 
		int val = 50; // variable initialization
		System.out.println(val);
		
	}

}


*/



/*
// uninitialized variables are not allowed in java

public class Day2_4 {

	public static void main(String[] args) 
	{
		int num; //variable declaration
		System.out.println(num); 
		//Compile time error : javac error 
		//The local variable num may not have been initialized

	}

}
*/

