// demo of functional interface vs non functional interface 

@FunctionalInterface
interface Demo
{
	public void f1();
}

// @FunctionalInterface // javac error
interface Test
{
	public void m1();
	public void m2();
}

public class Day16_1 {

	public static void main(String[] args) 
	{
		
	}

}
