import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// create a user defined class
// declare private fields
// declare constructor 
//declare some methods(public and private)

// reflect the class
// fetch the following information
// constructors, methods 

//call methods indirectly


class ReflectionDemo
{
	private String str; 
	public ReflectionDemo()
	{
		str="CoreJava";
	}
	
	public void method1()
	{
		System.out.println("Inside Method1 str = "+str);
	}

	public void method2(int num)
	{
		System.out.println("Inside Method2 Num = "+num);
	}
	
	private void method3()
	{
		System.out.println("Inside Method3");
	}
	
	
}



public class Day15_8 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException 
	{
		ReflectionDemo obj=new ReflectionDemo();
		//reflect the class
		Class cls = obj.getClass();
		System.out.println("Name of the class = "+cls.getName());
		
		Constructor ctr = cls.getConstructor();
		System.out.println("Name of the constructor = "+ctr.toString());

		System.out.println("Get Mthods Public Methods in the class and in super class  ");
		Method m[]= cls.getMethods();
		for(Method mtd  : m)
			System.out.println(mtd);
	
		
		System.out.println("Methods in the class (public and private) ");
		Method m1[]= cls.getDeclaredMethods();
		for(Method mtd  : m1)
			System.out.println(mtd);
		
		//call the methods indirectly
		Method methodcall1 = cls.getDeclaredMethod("method2",int.class);
		methodcall1.invoke(obj, 45);
		
		Method methodcall2 = cls.getDeclaredMethod("method1");
		methodcall2.invoke(obj);
		
		Method methodcall3= cls.getDeclaredMethod("method3");
		methodcall3.setAccessible(true);
		methodcall3.invoke(obj);
		
		Field f = cls.getDeclaredField("str");
		System.out.println("Field = "+f.toString() );
		f.setAccessible(true);
		f.set(obj, "Sunbeam");
	
	}

}
