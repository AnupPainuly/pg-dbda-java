package string_handling;

public class Test1 {

	public static void main(String[] args) {
		// checking immutability of strings
		String s=new String("hello");
		String s1=s.concat("hi!");
		System.out.println(s);
		System.out.println(s1);
		s += "12345";//s=s+"12345";
		System.out.println(s);//hello12345
		String s2=s.toUpperCase();
		System.out.println(s);//hello12345
		System.out.println(s2);//upper cased string : HELLO12345
		//use substring : to get 12345
		//String API
		System.out.println(s2.substring(5));
		System.out.println(s2.substring(3,7));//LO12
		//Display YES if s2 contains the substring 123 or NO: searching
		//Hint : contains
		System.out.println(s2.contains("423")?"YES":"NO");
		//print 1st n last char of s2
		System.out.println("1st char "+s2.charAt(0)+" last char "+s2.charAt(s2.length()-1));
		String ss="Trying out strings api with some strings.....";
		System.out.println(ss.indexOf("strings234")+" "+ss.lastIndexOf("strings"));
		
		
		

	}

}
