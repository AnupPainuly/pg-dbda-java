package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestIntegerList {

	public static void main(String[] args) {
		// create empty AL to store integers
		ArrayList<Integer> list = new ArrayList<>();// size=0, capa=10
		System.out.println(list);// []
		System.out.println("size " + list.size());// 0
		int[] ints = { 10, 2, 3, 34,4, 101, 5, 45, 23, 12, 34, 23, 10, 2, 34 };
		// populate AL with above values
		for (int i : ints)
			list.add(i);
		System.out.println("list via toString " + list);
		System.out.println("list size " + list.size());
		// list.add(123.45);type checking added by javac : javac err
		// check if elem is present o absent : contains
		System.out.println(list.contains(344) ? "Present" : "Absent");
		// display 1st occurrence of 34 n it's last occurrence
		System.out.println("1st occurrence " + list.indexOf(34) 
		+ " last occurrence " + list.lastIndexOf(34));
		//remove element at index 5
		System.out.println("Removed "+list.remove(5));
		System.out.println("list after remove "+list);
		System.out.println("List contents using for-each : implicit Iterator");
		for(int i : list) //auto un boxing
			System.out.print(i+" ");
		System.out.println("\n List contents using for loop");
		for(int i =0;i<list.size();i++) 
			System.out.print(list.get(i)+" ");
		//Can you attach an Iterator explicitly to the AL ? : YES
		//1. attach an Iterator
		Iterator<Integer> itr=list.iterator();
		System.out.println("\n List contents using iterator ");
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		//Sort the elements in asc order n display it
		//API of Collections class
		//public <T extends Comparable<? super T>> void sort(List<T> list)
		Collections.sort(list);
		System.out.println("\nSorted list : ");
		for(int i : list) //auto un boxing
			System.out.print(i+" ");


	}

}
