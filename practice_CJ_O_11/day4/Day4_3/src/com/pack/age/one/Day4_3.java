package com.pack.age.one;

class Date{
	private int dd;
	private int mm;
	private int yy;
	
	Date(){
		this.dd=-1;
		this.mm=-1;
		this.yy=-1;
	}
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ",yy=" + yy + "]";
	}
	
}//end of class Date
class Employee{
	int id;
	Date dobj = new Date(); //association. creating obj of a certain class into another class.
	
	Employee(){
		this.id=123;
	}

	public String toString() {
		return id + "\t"+ dobj.toString();
	}

}//end of class Employee
public class Day4_3 {
	public static void main(String[] args) {
		Employee eobj = new Employee();
		System.out.println(eobj);
}
}
