package p1;

public class MyFormula implements Formula {

	@Override
	public double calculate(double a, double b) {
		System.out.println("abstract method imple : add");
		return a + b;
	}
}
