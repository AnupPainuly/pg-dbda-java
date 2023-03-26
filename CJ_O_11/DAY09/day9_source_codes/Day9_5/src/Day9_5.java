
class Test<T> // generic class
{
	private T obj; //generic field
	Test(T obj)  // constructor taking generic as parameter
	{
		this.obj=obj;
	}
	
	public T getObj() // function is having return value as Type Parameter
	{
		return this.obj;
	}
	
	public void setObj(T obj)  // function is having its argument as type parameter
	{
		this.obj = obj;
	}
	
	
}

public class Day9_5 {

	public static void main(String[] args)
	{
		Test<String> t1 = new Test<String>("Sunbeam");
		System.out.println(t1.getObj());
		t1.setObj("SUNBEAM");
		System.out.println(t1.getObj());
		
		Test<String> t2=new Test<String>("Akshita");
		t2.setObj("Trainer");
		System.out.println(t2.getObj());
		

	}

}
