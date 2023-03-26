import java.util.LinkedHashSet;
import java.util.TreeSet;


//TreeSet
//UnOrdered set (does not the maintains the sequence of data)
//Sorted
//no duplicate values are allowed
//does not allows null else it throws NPE 

public class Day13_5 {

	public static void main(String[] args) 
	{
		TreeSet<String> ts= new TreeSet<String>();
		ts.add("Sunbeam");
		ts.add("Pune");
		ts.add("Infotech");
		ts.add("Hinjewadi");
		ts.add("Akshita");
		//ts.add(null); //does not allow null // NPE
		ts.add("Sunbeam");
		
		System.out.println(ts);

	}

}





/*
// LinkedHashSet
// Ordered set (maintains the sequence of data)
// unsorted
// no duplicate values are allowed
//allowing null but only once 

public class Day13_5 {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		lhs.add("Sunbeam");
		lhs.add("Pune");
		lhs.add("Infotech");
		
		lhs.add("Hinjewadi");
		lhs.add("Akshita");
		lhs.add(null);
		lhs.add("Sunbeam");
		lhs.add(null);
		System.out.println(lhs);

	}

}

*/