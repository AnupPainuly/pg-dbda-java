package inheritance;

public class Student extends Person {
//additional state
	private int rollNo;
	private String enrolledCourse;
	private double fees;
	private int marks;
	private int gradYear;

	public Student(String fName, String lName, int age, int rollNo, String course, double fees, int marks,
			int gradYear) {
		// invoke explicitly MATCHING ctor of the super class
		super(fName, lName, age);
		System.out.println("in student ctor");
		this.rollNo = rollNo;
		enrolledCourse = course;
		this.fees = fees;
		this.marks = marks;
		this.gradYear = gradYear;
	}

	// add a modified form(overriding) of the getDetails method : to get COMPLETE
	// details of a student
	// method overriding : run time polymorphism
	// polymorphism => multiple or changing forms of the behavior
	// 2 forms of poly : compile time (static) Vs Run Time Poly (dynamic)
	// Rules : same method name, method args : same , ret type : same
	//Overrding for of the method CAN NOT restrict the scope(access specifier)
	public String getDetails()
	{
		return "Student "+super.getDetails()
		+" Roll No"+rollNo+" "+enrolledCourse+" "+fees+" "+marks
		+"graduated in"+gradYear;
	}

}
