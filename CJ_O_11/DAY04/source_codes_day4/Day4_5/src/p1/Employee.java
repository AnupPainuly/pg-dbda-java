package p1;

import java.util.Scanner;

// Employee class belongs to package p1
class Employee 
{
	int empid;
	String name;
	public Employee() 
	{
		this.empid=1;
		this.name="DEFAULT";
	}
	public Employee(int empid, String name) 
	{
		
		this.empid = empid;
		this.name = name;
	}
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Empid = ");
		this.empid=sc.nextInt();
		System.out.println("Enter name = ");
		this.name=sc.next();
		
	}
	void disp()
	{
		System.out.println("Name = "+this.name+" ID = "+this.empid);
	}
	
	
}
