package exception_handling;

import java.util.Scanner;

public class TestTryWithResources {

	public static void main(String[] args) {
		// try-with-resources
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter complete name");
			System.out.println("Hello ," + sc.nextLine());
			Thread.sleep(1000);
			System.out.println("Hi again !");
		} // JVM will auto call : sc.close()
			// Why : Scanner class implements : AutoCloseable i/f
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("in finally , but not generally required!");
		}

	}

}
