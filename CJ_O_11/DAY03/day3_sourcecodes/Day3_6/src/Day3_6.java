import java.util.Scanner;

// override toString()
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
	
	//override toString()
	
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
	
}



public class Day3_6
{
	public static void main(String[] args)
	{
			Employee e1=new Employee();  
			Employee e2=new Employee();
			Employee e3=e1; //reference copy
			e2.accept();
			e1.disp();
			e2.disp();
			System.out.println(e1); //e1.toString() ==> Employee 
			System.out.println(e2); //e2.toString()  ==> Employee
			System.out.println(e3);
	}
}
