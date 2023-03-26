
//constructor chaining
class Employee {
	String name;
	int id;
	float salary;
	String desg;
	
	Employee(){
		this("Default",-1,0.0f,"Default"); //constructor chaining
	}

	Employee(String name, int id, float salary, String desg){
		this.name= name;
		this.id=id;
		this.salary=salary;
		this.desg=desg;
	}
	public String toString() {
		return name+" "+id+" "+desg;
	}
	
}
public class Day3_8 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("anup",-1,0.0f,"lfjs");
		System.out.println(e1);
		System.out.println(e2);
		
	}
}

/*
class Employee{
	String name;
	int id;
	float salary;
	String desg;
	
	Employee(){
		this.name="default";
		this.id=-1;
		this.salary=0.0f;
		this.desg="default";
	}
	Employee(String name, int id, float salary, String desg){
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.desg=desg;
	}
	void display() {
		System.out.println(name+"\t"+id+"\t"+salary+"\t"+desg);
	}
	public String toString() {
		return name+" "+id+" "+desg;
	}
}
public class Day3_8 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("anup",131,45.31f,"fjs");
		System.out.println(e1);
		System.out.println(e2);
	}

}
*/