
public class TestPrimitiveTypes {

	public static void main(String[] args) {
		byte b1=10;
		byte b2=12;
	//	byte b3=b1+b2; int ---> byte : not allowed
		byte b3=(byte)(b1+b2);
	    byte b4=b1+=10;//no javac err : implicit type casting : javac
		short s1=100;
	//	short s2=b1+s1;
		int i1=12345;
		long l=i1;//int ---> long : auto conversion
		float f1=l;//long --> float : auto conversion
		double d1=12.34f;//float --> double
		float f2=(float)12.34;	
	}

}
