import java.util.Scanner;

public class Day10_1 {

	public static void main(String[] args) 
	{
		int num1,num2;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second Number ");
		num2 = sc.nextInt();
		
		result = num1/num2;
		
		System.out.println("Result = "+result);

	}

}

