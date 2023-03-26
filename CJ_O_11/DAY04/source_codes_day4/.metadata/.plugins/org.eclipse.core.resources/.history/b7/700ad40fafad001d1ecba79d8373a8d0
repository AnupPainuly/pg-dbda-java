
//BY DEFAULT THE FIELDS OF THE CLASS RECIEVES ACCESS SPECIFIER AT PACKAGE LEVEL
// package level visibility
// we were able to modify the fields of the class outside its scope
// No security

class Employee
{
	int empid;
	float salary;
	String name;
	
	Employee()
	{
		this.empid=1;
		this.salary=25000;
		this.name="DEFAULT";
	}
	
	Employee(int empid,float salary , String name)
	{
		this.empid=empid;
		this.salary=salary;
		this.name=name;
	}
	
	void disp()
	{
		System.out.println("Empid = "+this.empid+" Salary "+this.salary+" Name "+this.name);
		
	}
	
}

public class Day4_1 {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.disp();
		Employee e2=new Employee(123,50000,"emp1");
		e2.disp();
		Employee e3=new Employee(456,80000,"emp2");
		e3.disp();
		System.out.println("Modifying e2 salary");
		e2.salary=2000; //modify the field of the class outside its scope 
		e2.disp();
		System.out.println("Modifying e3 salary");
		e3.salary=e2.salary;
		e3.disp();
	}

}
