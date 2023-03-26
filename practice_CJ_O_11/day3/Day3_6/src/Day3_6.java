import java.util.Scanner;

//toString method
class Employee{
	String name;
	int id;
	int salary;
	
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of emp:- ");
		name = sc.next();
		System.out.println("enter the id:- ");
		id = sc.nextInt();
		System.out.println("enter the salary:- ");
		salary = sc.nextInt();
	}
	void disp() {
		System.out.println(name+"\t"+id+"\t"+salary);
	}
	public String toString() {
		return name+"\t"+id;
	}
}
public class Day3_6 {
	public static void main(String...args) {
		Employee e1 = new Employee();
		e1.accept();
		e1.disp();
		System.out.println(e1);

		
	}
}
