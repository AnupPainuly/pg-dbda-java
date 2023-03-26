import java.util.Iterator;
import java.util.LinkedList;

//

public class Day12_1 {

	public static void main(String[] args) 
	{
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Sunbeam");
		list1.add("Infotech");
		list1.add("Pune");
		list1.add("Karad");
		
		LinkedList<String> list2=(LinkedList<String>) list1.clone();
		System.out.println("List1 = "+list1);
		System.out.println("List2 = "+list2);
		list2.add("Akshita");
		System.out.println("List1 = "+list1);
		System.out.println("List2 = "+list2);
			
	}
}



/*
public class Day12_1 {

	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Sunbeam");
		list.add("Infotech");
		list.add("Pune");
		list.add("Karad");
		System.out.println("Initial List = "+list);
		
		System.out.println("Contains = "+list.contains("Sunbeam"));
		System.out.println("Contains = "+list.contains("sunbeam"));
	}
}
*/


/*
public class Day12_1 {

	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Sunbeam");
		list.add("Infotech");
		list.add("Pune");
		list.add("Karad");
		
		System.out.println("List = "+list);
		System.out.println("***********");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+ "\t");
		System.out.println();
		System.out.println("***********");
		for(String s : list)
			System.out.println(s);
		System.out.println("***********");
	
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
	}
}
*/


/*
public class Day12_1 {

	public static void main(String[] args) 
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Sunbeam");
		list.add("Infotech");
		list.add("Pune");
		list.add("Karad");
		System.out.println("Initial List = "+list);
		//add a element at first position
		// insertion of node at the head
		list.addFirst("Akshita");
		System.out.println("List = "+list);
		list.addLast("India");
		System.out.println("List = "+list);
		list.add(1,"Chanchlani");
		System.out.println("List = "+list);
		
		System.out.println("Removing the first element = "+list.removeFirst());
		System.out.println("Removing the last element = "+list.removeLast());
		System.out.println("Removing the element at index = "+list.remove(0));
		System.out.println("List = "+list);
		
		System.out.println("get = "+list.get(2));
		
		
	}

}

*/
