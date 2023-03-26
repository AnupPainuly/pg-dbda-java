import java.lang.reflect.Method;

//command line argument  args[0] = java.util.Stack
// reflect it
// display methods declared within java.util.Stack class



public class Day15_6 {

	public static void main(String[] args)
	{
		try 
		{
			Class c = Class.forName(args[0]);
			System.out.println(c.getName());
			
			Method m[]=c.getDeclaredMethods();
			//for(int i=0;i<m.length;i++)
				//System.out.println(m[i].toString());
			
			for(Method mtd : m)
				System.out.println(mtd);
			
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}

	}

}
