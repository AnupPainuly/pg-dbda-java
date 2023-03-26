/*
//Prog-1 local variable should be mandatorily initialized in java
public class Day2_3 { 
	public static void main(String[] args) {
		int num;
		System.out.println(num);
	}
}
*/

/*
//Prog-2 the intialized local variables are printed as expected. 
public class Day2_3 {
	public static void main(String[] args) {
		int num=10;
		System.out.println(num);
		int val =42;
		System.out.println(val);
	}
}
*/

/*
//Prog-3 formatting with the use of + operator in print statement
public class Day2_3 {
	public static void main(String[] args) {
		int num=8401;
		System.out.println("number="+num); //formatting the output. `+` concatenates.
	}
}
*/

//Prog-4 field vs local variable comparison
//variables residing in main function are local variable and outside the main funtion it is `field`.
//field can ve left unintialized but local variable can not.
//there can not be global variables in Java.
public class Day2_3 {
	int a;
	public static void main(String[] args) {
		float foo=30.34f;
		System.out.println(foo);
	}
	
}



























