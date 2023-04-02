package com.university;

public class Person {
	//private fields
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}//end of constructor
	
	public String toString() {
		return "Name: "+this.name+"Age: "+this.age;
	}//end of toString method
	
	

}
