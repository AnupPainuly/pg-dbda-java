import java.util.Scanner;

// accept input from user
// Scanner class (java.util package) 
// String ==> next() or nextLine()
// int ==> nextInt()
//float ==> nextFloat()



public class Day3_2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //sc is object of Scanner class
		
		System.out.println("Enter Name ");
		String str = sc.next();
		System.out.println("Enter Age ");
		int age = sc.nextInt();
		System.out.println("Enter percentage");
		float per=sc.nextFloat();
		
		System.out.println("Name = "+str);
		System.out.println("Age = "+age);
		System.out.println("Percentage = "+per);
		
	
	}

}
