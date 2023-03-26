import java.util.PriorityQueue;
import java.util.Queue;

public class Day12_7 {

	public static void main(String[] args) 
	{
		//Queue<String> pq = new PriorityQueue<String>(); // OK // UPCASTING
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Akshita");
		pq.add("Trainer");
		pq.add("Sunbeam");
		
		
		System.out.println("PQ = "+pq);
		System.out.println("Element = "+pq.element()); // front element 
		pq.poll();
		pq.poll();
		pq.poll();
		System.out.println("PQ = "+pq);
		System.out.println(pq.poll()); // it will return "null"
		
		System.out.println(pq.peek()); // it will return "null"
	}

}



/*
public class Day12_7 {

	public static void main(String[] args) 
	{
		//Queue<String> pq = new PriorityQueue<String>(); // OK // UPCASTING
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Akshita");
		pq.add("Trainer");
		pq.add("Sunbeam");
		
		
		System.out.println("PQ = "+pq);
		System.out.println("Element = "+pq.element()); // front element 
		pq.remove();
		pq.remove();
		pq.remove();
		System.out.println("PQ = "+pq);
		//pq.remove(); // Exception // NoSuchElementException
		//System.out.println(pq.element()); // Exception // NoSuchElementException
	}

}
*/



/*
public class Day12_7 {

	public static void main(String[] args) 
	{
		//Queue<String> pq = new PriorityQueue<String>(); // OK // UPCASTING
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Akshita");
		pq.add("Trainer");
		pq.add("Sunbeam");
		pq.add("CoreJava");
		
		System.out.println("PQ = "+pq);
		System.out.println("Element = "+pq.element()); // front element 
		
	}

}
*/
