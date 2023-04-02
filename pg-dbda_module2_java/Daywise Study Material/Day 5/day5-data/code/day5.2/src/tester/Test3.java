package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test3 {

	public static void main(String[] args) {
		Object o = new Student("Rama", "Kher", 24, 100, "PG-DBDA", 70000, 79, 2020);
		System.out.println(o);
		// Faculty type of ref(f1) ---> Faculty instance
		o = new Faculty("Mihir", "Rao", 40, 14, "Banking, Security");
		System.out.println(o);

	}

}
