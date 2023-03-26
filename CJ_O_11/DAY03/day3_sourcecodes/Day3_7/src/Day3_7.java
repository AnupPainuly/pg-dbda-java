

class Student
{
	String name;
	int rn;
	int marks;
	
	Student()
	{
		this.name="DEFAULT";
		this.rn=1;
		this.marks=45;
	}
	
	//Parameterized Constructor 
	Student(String name,int rn,int marks)
	{
		this.name=name;
		this.rn=rn;
		this.marks=marks;
	}
	
	
	void disp()
	{
		System.out.println("Name = "+this.name+" Roll no = "+this.rn+" Marks = "+this.marks);
	}

	
	public String toString() 
	{
		return "Student [rn=" + this.rn + ", marks=" + this.marks + "]";
	}
	
	
}

public class Day3_7 {

	public static void main(String[] args)
	{
		Student s1=new Student();
		//s1 is current object is being holded by "this" keyword 
		s1.disp();
		
		Student s2=new Student("Akshita",25,86);
		// s2 is current object it being holded by "this"
		s2.disp();
		
	
		
	}
}





/*
//if a class does not have any constructor 
//then compiler gives a call to DEFAULT CONSTRUCTOR
//default constructor initialize the fields of the class with default value

class Student
{
	String name;
	int rn;
	int marks;
	
	// constructor overloading 
	// parameterless constructor / user defined default constructor
	Student()
	{
		name="DEFAULT";
		rn=1;
		marks=45;
	}
	
	//Parameterized Constructor 
	Student(String n,int r,int m)
	{
		name=n;
		rn=r;
		marks=m;
	}
	
	
	void disp()
	{
		System.out.println("Name = "+name+" Roll no = "+rn+" Marks = "+marks);
	}

	
	public String toString() 
	{
		return "Student [rn=" + rn + ", marks=" + marks + "]";
	}
	
	
}

public class Day3_7 {

	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.disp();
		
		Student s2=new Student("Akshita",25,86);
		s2.disp();
		
	
		
	}
}



*/


/*

public class Day3_7 {

	public static void main(String[] args)
	{
		Student s1=new Student(); // CALL USER DEFINED DEFAULT CONSTRUCTOR
		// constructor gets called automatically
		// IMPLICIT CALLING 
		
		s1.disp(); //disp() is called upon s1 object 
		// EXPLICIT CALLING 
		System.out.println(s1);

	}

}
*/