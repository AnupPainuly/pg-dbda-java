import java.util.ArrayList;
import java.util.Vector;

public class Day12_5 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
	
		Vector<Integer> vec=new Vector<Integer>(al);
		System.out.println("AL = "+al+" Get Class = "+al.getClass());
		System.out.println("Vector = "+vec+" Get Class = "+vec.getClass());
		
	}

}
