package string_handling;

public class Test3 {

	public static void main(String[] args) {
		String s1="hello";
		String s2=new String(s1);
		String s3="HELLO";
		String s4="hello";
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//f
		System.out.println(s1==s4);//true
		System.out.println(s3==s4);//f
		System.out.println(s1.equals(s2));//t
		System.out.println(s1.equals(s3));//f
		System.out.println(s1.equals(s4));//t
		System.out.println(s1.equalsIgnoreCase(s3));//t
		System.out.println("Anish".compareTo("amish"));
		
				

	}

}
