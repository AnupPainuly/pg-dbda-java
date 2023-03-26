import java.util.Scanner;

public class Day3_3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //sc is object of Scanner class
		
		System.out.println("Enter Name ");
		String str = sc.next();
		System.out.println("Enter Age ");
		int age = sc.nextInt();
		System.out.println("Enter percentage");
		float per=sc.nextFloat();
		
		System.out.println(str+age+per);
		System.out.println(" Name = "+str+" Age ="+age+" Percentage = "+per);
		System.out.printf("%s %d  %f",str,age,per);
		System.out.printf("\n %15s %15d  %15.3f",str,age,per);
		System.out.printf("\n %-15s %-15d  %-15.3f",str,age,per);
		
	
	}

}