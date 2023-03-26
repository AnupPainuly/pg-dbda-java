
//static initialization block for static fields inside a class
class Test {
	private int num1;
	private int num2;
	private static int s;
	
	static {
		System.out.println("inside static initialization block");
		//s=80;//alternate way of initializinf of staic field
		Test.s=80;//initializing a static field
	}
	
	Test(){
		System.out.println("inside the parameterless block");
		this.num1=1;
		this.num2=1;
	}
	Test(int num1, int num2){
		System.out.println("inside the parameterized block");
		this.num1=num1;
		this.num2=num2;
	}
	void display() {
		System.out.printf("%d %d %d", this.num1, this.num2, Test.s);
		//non static field can be accessed using obj.
		//static field can be accessed using the class name.
	}
	//updating the static field requires its own static function
	void update() {
		Test.s+=10;
	}
	
}
public class Day5_1 {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.display();
		t1.update();
		System.out.println();
		t1.display();
	}
}
