import java.util.ArrayList;
import java.util.Iterator;

// create an AL from an array
// print AL in different ways

public class Day11_2 
{
	public static void main(String args[])
	{
		// create an empty AL
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// sample data in int[] format
		int data[]= {10,20,25,30,35,40,45,50,55,60};
		
		// to generate AL from data[]
		System.out.println("Adding Array to ArrayList");
		
		// data ==> p type
		// al ==> NP type 
		// implicit conversion
		for(int i : data)  
			al.add(i); //int to Integer ==> Autoboxing 
		
		System.out.println("Print the data using for loop");
		for(int i : al) // Integer to int ===> Autounboxing
			System.out.print(i+"\t");
		
		System.out.println();
		System.out.println("Array List = "+al); // al.toString()
		
		System.out.println("Printing data using conventional for loop");
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+"\t"); 
		
		System.out.println("\n Printing the data using Iterator");
		
		//attaching an iterator to the collection
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext())
			System.out.print(itr.next()+"\t");
		//System.out.print("\n"+itr.next()+"\t"); // Exception NoSuchElementException
		
		
		
	}

}
