
// if the scope of methods is same
// if one static method would like to call another method
//then that method must be compulsory be declared as static
 
public class Day4_13 
{
	static void sum(int num1,int num2) //non static 
	{
		System.out.println("Addition = "+(num1+num2));
	}
	
	static void sub(int num1,int num2) //non static 
	{
		System.out.println("Subtraction = "+(num1-num2));
	}
	
	public static void main(String[] args) //static method 
	{		
		sum(125, 115);  
		sub(510, 310);  
	}

}



/*
// javac error : static ref can not make a call to non static 
public class Day4_13 
{
	void sum(int num1,int num2) //non static 
	{
		System.out.println("Addition = "+(num1+num2));
	}
	
	void sub(int num1,int num2) //non static 
	{
		System.out.println("Subtraction = "+(num1-num2));
	}
	
	public static void main(String[] args) //static method 
	{		
		sum(125, 115);   // javac error // can not make static ref to non static method 
		sub(510, 310);  // javac error // can not make static ref to non static method 

	}

}

*/





/*
public class Day4_13 
{
	void sum(int num1,int num2)
	{
		System.out.println("Addition = "+(num1+num2));
	}
	
	void sub(int num1,int num2)
	{
		System.out.println("Subtraction = "+(num1-num2));
	}
	
	public static void main(String[] args)
	{
		Day4_13 obj= new Day4_13(); // not a good practice 
		obj.sum(25, 15); // ok // not recommended 
		obj.sub(50, 30);  //ok // not recommended 

	}

}


*/
