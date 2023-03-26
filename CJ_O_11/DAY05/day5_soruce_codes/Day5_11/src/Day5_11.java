//create array of reference // non primitive type

class Employee
{
	String name;
	int id;
	float salary;
	
	Employee()
	{
		
	}
	Employee(String name,int id,float salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
}

public class Day5_11 {

	public static void main(String[] args) 
	{
		Employee e[]=new Employee[3];
		e[0]=new Employee("emp1",123,50000);
		e[1]=new Employee("emp2",456,70000);
		e[2]=new Employee("emp3",789,60000);
		
		System.out.println("Print the employee records using for each");
		//emp = e[0]  emp = e[1]  emp = e[2] 
		//for each "emp" of type "Employee" inside the array "e"
		//print "emp"
		for(Employee emp : e)
			System.out.println(emp);
	}
}




/*
public class Day5_11 {

	public static void main(String[] args) 
	{
		Employee e[]=new Employee[3];
		System.out.println(e[0]);
		System.out.println(e[1]);
		System.out.println(e[2]);
		e[0]=new Employee("emp1",123,50000);
		e[1]=new Employee("emp2",456,70000);
		e[2]=new Employee("emp3",789,60000);
		
		System.out.println(e[0].toString());
		System.out.println(e[1].toString());
		System.out.println(e[2].toString());
		
		

	}

}


*/
