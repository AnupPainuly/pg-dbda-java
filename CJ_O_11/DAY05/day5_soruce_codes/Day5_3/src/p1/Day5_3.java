package p1;

import java.util.Scanner;

public class Day5_3 
{
	static int num1; //static field
	static int num2; // static field 
	static Scanner sc; //static reference field 
	
		
	static
	{
		num1=5;
		num2=5;
		sc=new Scanner(System.in);
	}
	
	static void accept()
	{
		
		System.out.println("Enter num1 ");
		num1=sc.nextInt();
		System.out.println("Enter num2 ");
		num2=sc.nextInt();
		
	}
	
	
	
	static void disp()
	{
		System.out.println("Num1 = "+num1+" Num2 = "+num2);
	}

	public static void main(String[] args) 
	{
		disp();
		accept();
		disp();
		
	}

}
