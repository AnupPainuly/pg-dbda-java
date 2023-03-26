
class Employee{
	int id;
	String name;
	float salary;
	
	Employee(){
		
	}
	
	Employee(int id, String name, float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return id+"\t"+name+"\t"+salary;
	}
}
public class Day5_11 {
	public static void main(String[] args) {
		Employee e[]=new Employee[3];
		e[0]=new Employee(123,"emp1",42423.43f);
		e[1]=new Employee(133,"emp2",4423.3f);
		e[2]=new Employee(321,"emp3",4223.35f);
		System.out.println("printing the employe records using for loop");
		for(Employee i : e) {
			System.out.println(i);
		}
	}
}
