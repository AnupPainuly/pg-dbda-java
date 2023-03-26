import java.util.Objects;

class Employee
{
	int empid;
	String name;
	Employee()
	{
		
	}
	Employee(int empid,String name)
	{
		this.empid=empid;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(empid, name);
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid && Objects.equals(name, other.name);
	}
	
	
	
	
}
public class Day7_3 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee(123,"akshita");
		Employee e2=new Employee(123,"akshita");
		System.out.println("E1 == E2 "+(e1==e2));
		System.out.println("E1 equals E2 "+e1.equals(e2));
		System.out.println("E1 hashcode = "+e1.hashCode());
		System.out.println("E2 hashcode = "+e2.hashCode());
	}

}
