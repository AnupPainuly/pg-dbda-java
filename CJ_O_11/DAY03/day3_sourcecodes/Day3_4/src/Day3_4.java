import java.util.Scanner;

class Employee
{
	String name;  //field 
	int id;  //field 
	int salary; // field 
	
	void accept()  // method (non static)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter ID ");
		id=sc.nextInt();
		System.out.println("Enter Salary ");
		salary = sc.nextInt();
	}
	void disp() // method (non static)
	{
		System.out.println("Name = "+name+" ID = "+id+" Salary = "+salary);
	}
}



public class Day3_4
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.accept();
		e1.disp();
		Employee e2 = e1; //reference copy
		e2.disp();
		
		
	}
}




/*
public class Day3_4
{
	public static void main(String[] args)
	{
		Employee e=null; // e is null object
		e=new Employee();
		e.disp(); 
		
	}
}
*/

/*
public class Day3_4
{
	public static void main(String[] args)
	{
		Employee e=null; // null reference // null object  
		e.disp();
		//if you call any method on null reference
		// you will receive NPE (NullPointerException)
		//Calling the instance method of a null object.
		//Accessing or modifying the field of a null object.
	}
}
*/

	



/*
public class Day3_4
{
	public static void main(String[] args)
	{
		Employee e; // e is a reference // local variable
		// local variable e may not have been initialized 
		e.disp(); // javac error 
	}
}
*/





/*
public class Day3_4
{
	public static void main(String[] args)
	{
		Employee e; // e is a reference declaration 
		e=new Employee(); // e is object (initialize)
		// e is declared within main(), e is local variable 
		// e is object  
		//e is method local variable 
		e.disp(); // null   0   0
		
	}
}
*/


/*
public class Day3_4
{

	public static void main(String[] args)
	{
		Employee eobj=new Employee(); //eobj is an object of Employee
		eobj.accept(); //accept() method is called upon eobj 
		eobj.disp();  // disp() method is called upon eobj 
		
	}

}
*/
