package maps;

public class Student {
	private String prn;
	private String name;
	private int marks;
	public Student(String prn, String name, int marks) {
		super();
		this.prn = prn;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", marks=" + marks + "]";
	}
	public String getPrn() {
		return prn;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	

}
