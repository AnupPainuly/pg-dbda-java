package tester;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test2 {

	public static void main(String[] args) {
		// below are egs of direct referencing
		// when type of the ref is same as type of instance : direct referencing
		// Student type of ref(s1) ---> Student cls instance
		Student s1 = new Student("Rama", "Kher", 24, 100, "PG-DBDA", 70000, 79, 2020);
		// Faculty type of ref(f1) ---> Faculty instance
		Faculty f1 = new Faculty("Mihir", "Rao", 40, 14, "Banking, Security");

		System.out.println(s1);// s1.toString()
		System.out.println(f1);// f1.toString()
		Person p;// created Person type of the ref.
		System.out.println("---------------------------");
		p = s1;// upcasting :javac does it implicitly : Student IS-A Person : extends
		System.out.println(p);// run time poly : toString() method to be called on which instance : decision
								// taken by run time : JVM
		System.out.println("---------------------------");
		p=f1;
		System.out.println(p);
	}

}
