import java.util.Scanner;

// print the hashcode by calling toString()
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



public class Day3_5
{
	public static void main(String[] args)
	{
		Employee eobj=new Employee();
		System.out.println(eobj); //Employee@2401f4c3
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		//whenever we print object 
		//it displays hashcode
		
		// whenever we print the object
		// it gives a call to the method , toString() method 
		// from Object class
		System.out.println(eobj.toString());	
	}
}
