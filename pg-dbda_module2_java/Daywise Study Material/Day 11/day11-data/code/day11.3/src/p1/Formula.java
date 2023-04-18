package p1;

public interface Formula {
	// public n abstract
	double calculate(double a, double b);
	//public n concrete method
	default double sqrt(double a, double b) {
		System.out.println("in def method of i/f");
		return Math.sqrt(a * b);
	}
}
