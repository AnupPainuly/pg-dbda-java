package com.pack.age.two;

import java.util.Scanner;

public class Manager {
	int mid;

	public Manager() {
		this.mid=0;
	}
	public Manager(int mid) {
		this.mid=mid;
	}
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mid: ");
		this.mid=sc.nextInt();
	}
	public void display() {
		System.out.printf("%d",mid);
	}

}
