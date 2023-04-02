package com.university.tester;

import com.university.*;//importing all the classes form com.university
import java.util.Scanner;
public class TestingUniversity {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student(sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
		System.out.println(s1);//implicitly toString method is called `System.out.println(s1.toString)
		sc.close();//closing the scanner
		
	}//end of main

}//end of TestingUniversity
