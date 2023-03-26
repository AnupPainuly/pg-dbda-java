package com.pack.age.two;

import java.util.Scanner;

public class Employee {
	String name;
	int id;
	float salary;
	
	public Employee() {
		this.name="default";
		this.id=-1;
		this.salary=0.0f;
	}

	public Employee(String name, int id, float salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name: ");
		this.name=sc.nextLine();
		System.out.println("enter the id: ");
		this.id=sc.nextInt();
		System.out.println("enter the salary: ");
		this.salary=sc.nextFloat();
	}
	public void display() {
		System.out.printf("%s %d %f",name,id,salary);
	}
}
