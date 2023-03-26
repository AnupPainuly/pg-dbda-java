
// Bounded type parameter

class Box<T extends Number>
{
	private T obj;

	public T getObj() 
	{
		return obj;
	}

	public void setObj(T obj) 
	{
		this.obj = obj;
	}
	
}

public class Day9_7 {

	public static void main(String[] args) 
	{
		Box b1=new Box(); // Raw type // ok
		System.out.println(b1.getObj());
		Box<Integer> b2=new Box<Integer>(); //ok
		b2.setObj(45);
		System.out.println(b2.getObj());
		
		Box<Double> b3=new Box<Double>(); //ok
		b3.setObj(85.5);
		System.out.println(b3.getObj());
		
		//Box<String> b4=new Box<String>(); //NOT OK // Bound Mismatch
		//b4.setObj("Sunbeam");
		//System.out.println(b4.getObj());

	}

}






/*
class Box<T>
{
	private T obj;

	public T getObj() 
	{
		return obj;
	}

	public void setObj(T obj) 
	{
		this.obj = obj;
	}
	
}

public class Day9_7 {

	public static void main(String[] args) 
	{
		Box b1=new Box(); // Raw type // ok
		System.out.println(b1.getObj());
		Box<Integer> b2=new Box<Integer>(); //ok
		b2.setObj(45);
		System.out.println(b2.getObj());
		
		Box<Double> b3=new Box<Double>(); //ok
		b3.setObj(85.5);
		System.out.println(b3.getObj());
		
		Box<String> b4=new Box<String>(); //ok
		b4.setObj("Sunbeam");
		System.out.println(b4.getObj());

	}

}

*/