package com.pack.age.one;

import java.util.Scanner;

public class Day5_3 {
	static int num1; // static field
	static int num2; //static field
	static Scanner sc; //static reference
	
	static { //static initialization block
		num1=-1;
		num2=-1;
		sc=new Scanner(System.in);
	} //end of static initialization block
	
	static void accept() {
		System.out.println("enter num1");
		num1=sc.nextInt();
		System.out.println("enter num2");
		num2=sc.nextInt();
	}//end of accept facility
	
	static void display() {
		System.out.printf("%d %d",num1,num2);
	}//end of display facility
	
	public static void main(String[] args) {
		display();
		System.out.println();
		accept();
		System.out.println();
		display();
	} //end of entry point function main

}
