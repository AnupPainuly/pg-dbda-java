package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			//display curnt date
			System.out.println("Curnt Date "+LocalDate.now());
			//display curnt time
			System.out.println("Curnt time "+LocalTime.now());
			//display curnt date n time
			System.out.println("curnt date n time "+LocalDateTime.now());
			System.out.println("Enter yr , mon , day");
			LocalDate joinDate1=LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
			System.out.println("join date "+joinDate1);
			System.out.println("Enter join date for another emp : yyyy-MM-dd");
			LocalDate joinDate2=LocalDate.parse(sc.next());
			System.out.println("join date "+joinDate2);
			//isBefore
			System.out.println("is before "+joinDate1.isBefore(joinDate2));
			//compareTo
			System.out.println("compareTo "+joinDate1.compareTo(joinDate2));
			System.out.println("Enter no of days for the emps' join date");
			System.out.println("Your join date "+LocalDate.now().plusDays(sc.nextLong()));
			
		}//sc.close()

	}

}
