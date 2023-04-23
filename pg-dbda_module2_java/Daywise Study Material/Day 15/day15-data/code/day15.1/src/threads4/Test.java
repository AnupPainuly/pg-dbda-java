package threads4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter begin n end values");
			int begin=sc.nextInt();
			int end=sc.nextInt();
			//even
			Thread t1=new Thread(new EvenPrinterTask(begin, end), "even_printer");
			Thread t2=new Thread(new OddPrinterTask(begin, end), "odd_printer");
			Thread t3=new Thread(new AveragerTask(begin, end), "avg_printer");
			t1.start();
			t2.start();
			t3.start();
			System.out.println("main waiting for child thrds to complete exec");
			t1.join();
			t2.join();
			t3.join();
			System.out.println("all thrds over....");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
