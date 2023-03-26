
// parameterless constructor of super class is called automatically
// from the parameterless constructor of sub class 

class Person
{
	String name;
	int age;
	
	Person()
	{
		System.out.println("Inside Parameterless Const Person");
		this.name="DEFAULT";
		this.age=18;
	}
	
	void disp()
	{
		System.out.println("Name = "+this.name+ " Age = "+this.age);
	}
}

class Employee extends Person
{
	int empid;
	int salary;
	Employee()
	{
		System.out.println("Inside Parameterless Const Employee");
		this.empid=1;
		this.salary=40000;
	}
	void print()
	{
		disp();
		System.out.println("Empid = "+this.empid+" Salary = "+this.salary);
		
	}
}


public class Day7_7 {

	public static void main(String[] args) 
	{
		Employee eobj=new Employee();
		eobj.print();
		

	}

}
