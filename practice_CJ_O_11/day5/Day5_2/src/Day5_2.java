//static setters and static field in a class.
class Test{
	private int num1; //non static field
	private int num2; //non static field
	private static int num3; //static field
	
	public void setNum1(int num1) { //non static method | concrete method
		this.num1=num1;
		
	}
	
	public void setNum2(int num2) { 
		this.num2=num2;
	}
	
	public static void setNum3(int num3) { //static method | class level
		Test.num3 = num3;
	}
	
	void printRecord() {
		System.out.println(this.num1);
		System.out.println(this.num2);
		System.out.println(Test.num3);
	}
	
}
public class Day5_2 {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.setNum1(42);
		t1.setNum2(535);
		Test.setNum3(90);
		t1.printRecord();
		
	}

}
