package com.university;

public class Student extends Person { //inheriting Student from Person
	
	private int rollno;
	private String course;
	
	public Student(String name, int age, int rollno, String course) {
		super(name, age);
		this.rollno=rollno;
		this.course=course;
		
	}//end of constructor
	public String toString() {
		return "Student: "+super.toString()+" "+rollno+" "+course;
	}//end of overridden toString method
	
}//end of Class Student
