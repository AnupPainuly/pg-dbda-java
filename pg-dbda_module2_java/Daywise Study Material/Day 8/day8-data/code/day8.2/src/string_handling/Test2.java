package string_handling;

public class Test2 {

	public static void main(String[] args) {
		// testing equality of strings : IMPORTANT
		String s1=new String("hello");
		String s2=new String(s1);
		System.out.println(s1==s2);//false : ref equality
		System.out.println(s1.equals(s2));//true : content equality ; case sensitive
		String s3=new String ("HELLO");
		System.out.println(s1.equals(s3));//false --
		System.out.println(s1.equalsIgnoreCase(s3));//true

	}

}
