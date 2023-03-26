import java.util.Scanner;

public class Day3_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //creates an object of class scanner and invokes a constructor with argument as (System.in)
		System.out.println("enter name: ");
		String str = sc.next(); //this will scan only next `token` to scan more than one token use nextLine()
		
		System.out.println("enter the age: ");
		int age = sc.nextInt();
		
		System.out.println("enter th perc: ");
		float per= sc.nextFloat();
		
		System.out.println(str+"\t"+age+"\t"+per);
	}
}
