package date_time;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ComputeAge {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter DoB : yr-mon-day");
			LocalDate dob=LocalDate.parse(sc.next());
			int age=Period.between(dob, LocalDate.now()).getYears();
			System.out.println("Age in years : "+age);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
