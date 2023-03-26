import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

// Fail Safe Iterator 
//During traversing, if iterator allows us to do changes  in collection

public class Day12_6 {

	public static void main(String[] args)
	{
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		System.out.println("Vec = "+vec);
		Integer element = null;
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements())
		{
			element = e.nextElement();
			System.out.print(element +"\t");
			
			if(element ==30)
				vec.add(88); // modify the collection // OK // allowed 
		}
		System.out.println("\n Vec = "+vec);
		
		
	}
}




/*
//Fail Fast Iterator
// during traversing if we use Iterator or ListIterator
//and if we try to modify the collection
// it will throw an exception ConcurrentModificationException

public class Day12_6 {

	public static void main(String[] args)
	{
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		System.out.println("Vec = "+vec);
		Integer element=null;
		
		Iterator<Integer> itr = vec.iterator();
		System.out.println("Printing the elements in Forward Direction ");
		while(itr.hasNext())
		{
			element = itr.next();
			System.out.print(element+" ");
			if(element == 30)
				vec.add(99); // ConcurrentModificationException
		}
		
	}
}
*/




/*
// ListIterator allows to traverse in forward and reverse direction
public class Day12_6 {

	public static void main(String[] args)
	{
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		System.out.println("Vec = "+vec);
		Integer element=null;
		
		ListIterator<Integer> ltr = vec.listIterator();
		System.out.println("Printing the elements in Forward Direction ");
		while(ltr.hasNext())
		{
			element = ltr.next();
			System.out.print(element+" ");
		}
		System.out.println("\n Printing the elements in Reverse Direction ");
		
		while(ltr.hasPrevious())
		{
			element = ltr.previous();
			System.out.print(element+" ");
		
		}
		

	}

}


*/