import java.util.Scanner;

class Employee{
	String name;
	int id;
	int salary;

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name: ");
		name = sc.nextLine();

		System.out.println("enter the id: ");
		id = sc.nextInt();

		System.out.println("enter the salary: ");
		salary = sc.nextInt();

	}

	void display() {
		System.out.println(name+"\t"+id+"\t"+salary);
	}
}
public class Day3_5 {
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e); //printing the object will call toString() method and output the hascode of the object
		System.out.println(e.toString()); //internally line: 28 will look like this
	}

}
