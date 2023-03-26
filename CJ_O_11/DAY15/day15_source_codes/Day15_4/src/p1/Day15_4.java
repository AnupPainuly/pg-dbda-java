package p1;

import java.lang.annotation.Annotation;

public class Day15_4
{

	public static void main(String[] args) 
	{
		Class<?> c = Book.class;
		Annotation[] a = c.getDeclaredAnnotations();
		
		for(Annotation ann : a)
		{
			if(ann instanceof Author)
			{
				Author author = (Author)ann;
				System.out.println("First Name = "+author.firstName());
				System.out.println("Last Name = "+author.lastName());
					
			}
		}
		
	}

}
