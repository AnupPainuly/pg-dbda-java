

class Test
{
	private int num1; // non static field 
	private int num2; // non static field
	private static int s;  // static field 
	
	//static initialization block
	//it is used to initialize the values to static fields 
	// static initialization block gets called at the time of class loading
	
	static
	{
		System.out.println("Inside static initialization block");
		//s=80; //valid
		//OR
		Test.s=80; //valid 
	}
	
	Test()
	{
		System.out.println("Calling parameterless constructor");
		this.num1=1;
		this.num2=1;
	}
	
	Test(int num1,int num2)
	{
		System.out.println("Calling paramatrized constructor");
		this.num1=num1;
		this.num2=num2;
		
	}

	void disp()
	{
		System.out.println("Num1 = "+this.num1+" Num2 = "+this.num2);
		System.out.println("Value of variable s = "+Test.s);
		// non static fields can be accessed using object
		// static fields can be accessed using class name 
		
		
	}
	
	// update static field data
	void update()
	{
		Test.s+=10; //Test.s= Test.s + 10 
	}
	
}
public class Day5_1
{
    public static void main(String args[])
    {
       Test t1=new Test();
       t1.disp(); // 1 1 80 
       Test t2=new Test(25,15);
       t2.disp(); // 25   15    80
       t2.update();
       t2.disp(); //25    15    90
       t1.disp(); // 1   1   90
       t1.update();
       t1.disp();
       t2.disp();
    }
    
}