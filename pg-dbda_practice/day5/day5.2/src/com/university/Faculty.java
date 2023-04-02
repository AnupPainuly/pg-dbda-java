package com.university;

public class Faculty extends Person {
	private int exp;
	private String domain;

	
	public Faculty(String name, int age, int exp, String domain) {

		super(name,age);
		this.exp=exp;
		this.domain=domain;
	}//end of constructor

}//end of class Faculty
