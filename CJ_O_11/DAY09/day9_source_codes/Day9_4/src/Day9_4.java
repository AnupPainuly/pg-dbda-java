// generics works only with non primitive type 
// class Test is generic class


class Test<T> // generic class 
{
	T obj; //generic field 
	
	Test(T obj)
	{
		this.obj=obj;
	}
	
	void disp()
	{
		System.out.println(this.obj);
	}
	
}
public class Day9_4 
{
	public static void main(String[] args)
	{
		Test t1 = new Test(15); // Raw Type
		t1.disp();
		
		Test<Integer> t2=new Test<Integer>(55);
		t2.disp();
		
		Test<Double> t3=new Test<Double>(8.5);
		t3.disp();
		
		Test<String> t4=new Test<String>("Akshita");
		t4.disp();
		
		
		
	}

}
