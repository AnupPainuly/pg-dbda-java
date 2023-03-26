
public class Day10_9 {

	public static void main(String[] args)
	{
		
	try
	{
		int result = 25/0;
		System.out.println("Result = "+result);
	}
	catch(ArithmeticException e)
	{
		System.out.println("E : "+e);
		System.out.println("Localized msg : "+e.getLocalizedMessage());
		System.out.println("Get Msg : "+e.getMessage());
		System.out.println("Cause : " + e.getCause());
		System.out.println("Get Stack Trace : "+e.getStackTrace());
		e.printStackTrace();
	}
	
	}
}




/*
public class Day10_9 {

	public static void main(String[] args)
	{
		
	try
	{
		int result = 25/5;
		System.out.println("Result = "+result);
		
		int data[]= {10,20,30,40};
		System.out.println("Array Data[0] = "+data[2]);
		
		System.out.println("Number = "+Integer.parseInt("abc12345"));
	}
	catch(ArithmeticException e)
	{
		System.out.println("Inside AE catch block"+e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Inside AIOOBE catch block "+e);
	}
	catch(NumberFormatException e)
	{
		System.out.println("Inside NFE Catch block"+e);
	}

	}

}
*/