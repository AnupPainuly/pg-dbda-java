import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day15_4 
{

	@SafeVarargs
	static void m1(List<String>... stringLists)
	{
		   Object[] array = stringLists;
		   List<Integer> tmpList = Arrays.asList(42);
		   array[0] = tmpList; // Semantically invalid, but compiles without warnings
		   
		 }
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		
		List l1=new ArrayList();
		l1.add("str1");
		l1.add("str2");
		l1.add(20);
		m1(l1);		
	}

}
