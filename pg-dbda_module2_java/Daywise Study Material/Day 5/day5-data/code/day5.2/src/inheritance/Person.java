package inheritance;

public class Person {
	private String firstName, lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		System.out.println("in person ctor");
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	// add overloaded def arg less ctor
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	// override toString method , inherited from Object class 
//	: to ret complete details of a person
	
	public String toString() {
		return firstName + " " + lastName + " age=" + age;
	}
}
