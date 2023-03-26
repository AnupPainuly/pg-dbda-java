
import java.util.Scanner;

class Circle {
	final float PI=3.14f;
	int radius;
	
	Circle(){
		
	}
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		this.radius=sc.nextInt();
	}
	
	void displayarea() {
		System.out.println((PI*radius*radius));
	}

	
}
public class Day4_7 {
	public static void main(String[] args) {
		Circle cobj=new Circle();
		cobj.accept();
		cobj.displayarea();


	}

}
