package p2;

public class MyFormula2 implements Formula {

	@Override
	public double calculate(double a, double b) {
		System.out.println("abstract method imple : substraction.");
		return a - b;
	}

	@Override
	public double sqrt(double a, double b) {
		System.out.println("overriding default method");
		//can u access the def method imple in the i/f ? YES
		System.out.println(Formula.super.sqrt(a,b));
		return Math.sqrt(a-b);
	}
	
}
