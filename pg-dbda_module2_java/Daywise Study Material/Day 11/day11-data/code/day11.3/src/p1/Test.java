package p1;

public class Test {

	public static void main(String[] args) {
		Formula[] formulae= {new MyFormula(),new MyFormula2()};
		for(Formula f : formulae)
		{
			System.out.println(f.calculate(20,10));
			System.out.println(f.sqrt(100,70));
		}

	}

}
