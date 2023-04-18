package p1;

public class Tester2 {

	public static void main(String[] args) {
		// imperative style of prog
		// add
		// System.out.println(testCompute(10, 20, new Adder()));
		// multiply
		// System.out.println(testCompute(12, 13,new Multiplier()));
		// declarative style of prog : Functional paradigm or prog
		// using lambda expr : anonymous function
		// Here we are passing the behavior (func) to another method : key feature of
		// functional prog.
		System.out.println(testCompute(11, 12, (a, b) -> a + b));
		System.out.println(testCompute(15, 6, (a, b) -> a / b));
		int a = 100;// assigning int value
		String s = "dgadfgfd";// string literal
		// function literal
		Computable ref = (x, y) -> x * y;
		System.out.println(testCompute(10, 20, ref));

	}

	// add a static method to test ANY math op.
	//higher order function / method
	//=any method which either accepts or rets (or both) the functionality 
	private static double testCompute(double a, double b, Computable ref) {
		return ref.compute(a, b);
	}

}
