package wrapper_classes;

public class Test1 {

	public static void main(String[] args) {
		int data = 1234;
		Integer i1 = Integer.valueOf(data);// boxing => explicit conversion from prim --> wrapper
		double d1 = 123.45;
		Double d = Double.valueOf(d1);// boxing
		double val = d.doubleValue();// un boxing(Double -->double)
		Integer i2 = 1345;// auto boxing (impl conversion from int ---> Integer)
		Double d2 = 34.56;// auto boxing
		// Double d3=12.34f;//float ---> auto boxing ---> Float ---X--- upcasted to
		// Double
		double d4 = 12.34f;// widening
		Number n1 = 12.346f;// float ---> Float : auto boxing --->upcasting --> Number
		n1 = 123.6789;
		Object o = true;// boolean --> Boolean ---> Object
		o = 45;
		o='c';//auto boxing n up casting
		// Java IS NOT a pure object oriented language BUT Object type of reference can
		// DIRECTLY refer to ANY type (prim type or ref type)
	}

}
