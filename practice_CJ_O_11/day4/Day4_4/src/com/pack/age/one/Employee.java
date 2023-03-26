package com.pack.age.one;

import java.util.Scanner;

public class Employee {
	String name;
	int id;
	float salary;
	
	Employee(){
		this.name="default";
		this.id=0;
		this.salary=0.0f;
	}//end of parameterless constructor

	Employee(String name, int id, float salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}//end of parameterized constructor
	
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name: ");
		this.name=sc.nextLine();
		System.out.println("enter the id: ");
		this.id=sc.nextInt();
		System.out.println("enter the salary: ");
		this.salary=sc.nextFloat();
	}
	
	void display() {
		System.out.printf("%s %d %f",name, id, salary);
	}

}
