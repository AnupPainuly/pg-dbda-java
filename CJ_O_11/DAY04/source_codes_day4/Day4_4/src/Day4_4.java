
class Date
{
	int dd;
	int mm;
	int yy;
	
	Date()
	{
		
	}

	@Override
	public String toString() 
	{
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
}

class Employee
{
	int empid;
	Date dobj=new Date(); //field , reference of Date class
	// ASSOCIATION
	public Employee() 
	{
		
	}
	@Override
	public String toString() 
	{
		return "Employee [empid=" + empid + ", dobj=" + dobj.toString() + "]";
	}
	
	
	
	
	
}

public class Day4_4 {

	public static void main(String[] args) 
	{
		Employee eobj = new Employee();
		System.out.println(eobj);

	}

}
