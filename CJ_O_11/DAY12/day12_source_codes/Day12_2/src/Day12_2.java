import java.util.LinkedList;

class Employee
{
	int empid;
	String name;
	Employee()
	{
		
	}
	Employee(int empid, String name)
	{
		this.empid=empid;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	
}
public class Day12_2 {

	public static void main(String[] args) 
	{
		Employee e1=new Employee(1,"emp1");
		Employee e2=new Employee(2,"emp2");
		Employee e3=new Employee(3,"emp3");
		Employee e4=new Employee(4,"emp4");
		
		LinkedList<Employee> list=new LinkedList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for(Employee e:list)
			System.out.println(e);

	}

}
