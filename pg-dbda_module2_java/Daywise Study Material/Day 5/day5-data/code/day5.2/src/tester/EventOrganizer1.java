package tester;

import java.util.Scanner;
import inheritance.*;

public class EventOrganizer1 {

	public static void main(String[] args) {
		// create scanner
		Scanner sc = new Scanner(System.in);
		// prompt user for max no of participants
		// create an array of refs : to refer to either student of faculty
		System.out.println("Enter max no of participants");
		Person[] participants = new Person[sc.nextInt()];
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println("1. Register Student 2. Register Faculty 3.Display details of all "
					+ "4. Display specific participant details 0. Exit");
			System.out.println("Choose Option");
			switch (sc.nextInt()) {
			case 1:
				if (counter < participants.length) {
					System.out.println(
							"Enter student details : fName,  lName,  age,  rollNo,  course,  fees,  marks gradYear");
					participants[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next(),
							sc.nextDouble(), sc.nextInt(), sc.nextInt());// up casting
					System.out.println("student registered!");
				} else
					System.out.println("Event full!!!!!!!!!!!!!!!!!!");
				break;
			case 2:
				if (counter < participants.length) {

					System.out.println("Enter faculty details : fName,  lName,  age,  exp in years , domain");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next());// up
																														// casting
					System.out.println("faculty registered!");
				} else
					System.out.println("Event full!!!!!!!!!!!!!!!!!!");
				break;
			case 3:
				System.out.println("All participants");
				for (Person p : participants)
					if (p != null)
						System.out.println(p);// run time poly.: JVM resolves the method binding here using type of the
												// object(student or a faculty)
				break;
			case 4:
				System.out.println("Enter seat no");
				int index = sc.nextInt() - 1;
				if (index >= 0 && index < counter) {
					System.out.println("Printing specific participant details : ");
					System.out.println(participants[index]);// run time poly.
				} else
					System.out.println("Invalid Seat No !!!!!!!!!!!!!");
				break;
			case 0:
				exit = true;
				break;
			}
		}
		// close scanner
		sc.close();
	}

}
