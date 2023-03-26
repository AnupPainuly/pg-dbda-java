
class Test
{
	int num1;
	int num2;
	
	Test()
	{
		this.num1=5;
		this.num2=5;
	}
	Test(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	void disp()
	{
		System.out.println("Num1 = "+this.num1+" Num2 = "+this.num2);
	}
	
}

public class Day4_9 
{

	public static void main(String[] args) 
	{
		Test t1=new Test(10,15);
		Test t2=new Test(25,20);
		final Test t3=t2; //t3 is final reference 
		t1.disp();
		t2.disp();
		t3.disp();
		//t3=t1; // final reference can point to only one location
		// that location must be specified at the time of declaration of reference 
		
		final Test t4=new Test(80,70); // t4 is final object 
		t4.disp();
		//t4=new Test(99,88); // not allowed // final 
		t2=new Test(111,222); // allowed 
		t2.disp();

	}

}
