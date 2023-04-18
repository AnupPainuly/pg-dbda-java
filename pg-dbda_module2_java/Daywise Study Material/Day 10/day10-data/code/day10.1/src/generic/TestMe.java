package generic;

public class TestMe {

	public static void main(String[] args) {
		// create holder class instance to hold : int
		Holder<Integer> h1 = new Holder<>(12345);// int --> Integer : auto boxing
		int data = h1.getRef();// no need of explicit down casting , only conversion : Integer --> int : auto
								// un boxing
		// create holder class instance to hold the string
		Holder<String> h2=new Holder<>("hello");//no implicit conversion
		String s=h2.getRef();
	//	h1=h2;//javac err : since h1 : Holder<Integer> , h2 : Holder<String >=> totally incompatible
		

	}

}
