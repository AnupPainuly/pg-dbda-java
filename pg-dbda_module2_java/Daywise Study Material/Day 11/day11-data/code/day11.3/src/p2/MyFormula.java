package p2;

public class MyFormula implements Formula {

	@Override
	public double calculate(double a, double b) {
		System.out.println("abstract method imple : add");
		//how to access a static method from the imple class ?
		Formula.show();
		return a + b;
	}
//	@Override
	public static void show()
	{
		System.out.println("in class's static method");
	}
}
