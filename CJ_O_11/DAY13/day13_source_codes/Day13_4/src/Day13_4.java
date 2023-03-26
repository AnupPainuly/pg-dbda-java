import java.util.HashSet;
import java.util.Objects;

class Employee
{
	private String name;
	private int id;
	public Employee(String name, int id) 
	{
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
}
public class Day13_4 {

	public static void main(String[] args) 
	{
		HashSet<Employee> hs=new HashSet<Employee>();
		hs.add(new Employee("Akshita",1234));
		hs.add(new Employee("emp2",789));
		hs.add(new Employee("emp3",456));
		
		for(Employee e:hs)
			System.out.println(e);
	
		System.out.println("HS = "+hs);
		
		Employee key = new Employee("Akshita",1234);
		System.out.println(hs.contains(key));
		
	}

}
