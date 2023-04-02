package string_handling;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("hello");
		System.out.println(sb1);//hello
		System.out.println("len="+sb1.length()+" capa "+sb1.capacity());
		StringBuilder sb2=sb1.append("hi");
		System.out.println(sb1);//hellohi
		System.out.println(sb2);//hellohi
		System.out.println(sb1==sb2);//true
		sb1.append(false).append("fhfghgfh").append(12345).append(456.789);
		System.out.println(sb1);
		System.out.println("len="+sb1.length()+" capa "+sb1.capacity());
		
		

	}

}
