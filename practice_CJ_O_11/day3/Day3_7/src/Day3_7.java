/*
class Student{
	String name;
	int roll_number;
	int marks;
	
	//parameterless constructor
	Student(){
		name="Default";
		roll_number=-1;
		marks=-1;
	}
	//parameterized constructor
	Student(String n, int r, int m){
		name=n;
		roll_number=r;
		marks=m;
	}
	void display() {
		System.out.println(name+"\t"+roll_number+"\t"+marks);
	}
	public String toString() {
		return name+"\t"+roll_number;
	}
}
public class Day3_7 {
	public static void main(String[] args) {
		Student s1 = new Student();// call to parameterless constructor
		s1.display();
		Student s2  = new Student("anup",73995,887);
		s2.display();
		System.out.println(s2);
		
	}

}
*/
class Student{
	String name;
	int roll_number;
	int marks;
	
	//user defined parameter less constructor.
	Student(){
		this.name="default";
		this.roll_number=-1;
		this.marks=-1;
	}
	Student(String name, int roll_number, int marks){
		this.name=name;
		this.roll_number=roll_number;
		this.marks=marks;
	}
	void display() {
		System.out.println(this.name+"\t"+this.roll_number+"\t"+this.marks);
	}
	public String toString() {
		return this.name+"\t"+this.roll_number;
	}
}
public class Day3_7{
	public static void main(String[] args) {
		Student s1 = new Student(); //call to parameterless constructor
		s1.display();
		Student s2 = new Student("anup-c",73995, 887);
		s2.display();
		System.out.println(s2); //call to user defined toString. if userdefined toString method is absent this prints the hashcode
		
	}
	
}