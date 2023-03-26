class Test<T,U>
{
	T n1;
	U n2;
	
	Test(T n1,U n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	
	void print()
	{
		System.out.println("N1 = "+this.n1+" N2 = "+this.n2);
		
	}
	
	
}
public class Day9_8 {

	public static void main(String[] args) 
	{
		Test t1=new Test(10,5); // Raw Type
		t1.print();
		Test<Integer,Integer> t2=new Test<Integer,Integer>(25,55);
		t2.print();
		Test<Integer,Float> t3=new Test<Integer,Float>(15,2.5f);
		t3.print();
		Test<Float,Float> t4=new Test<Float,Float>(9.8f,3.5f);
		t4.print();
		
		Test<String,Integer> t5=new Test<String,Integer>("Sunbeam",1234);
		t5.print();
	}

}