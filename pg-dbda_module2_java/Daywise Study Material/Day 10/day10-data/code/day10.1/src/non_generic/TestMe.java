package non_generic;

public class TestMe {

	public static void main(String[] args) {
		// create Holder class instance to hold : int.
		Holder h1 = new Holder(1234);// int --> Integer (auto boxing) --> Object (up casting)
		int data = (Integer) h1.getRef();// to access data , explicit down casting is required
		// create Holder class instance to hold a literal string : "hello"
		Holder h2 = new Holder("hello");// String ---> Object : up casting
		String s=(String)h2.getRef();// to access data , explicit down casting is required
		h1=h2;
		data = (Integer) h1.getRef(); //in non generic syntax , it might raise class cast exc.
		System.out.println("main over....");

	}

}
