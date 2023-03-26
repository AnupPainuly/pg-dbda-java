import java.util.ArrayList;

// upper bound wild card

public class Day11_6 
{
	public static ArrayList<Integer> getIntList() // function having return type as AL
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		return list;
		
	}
	
	public static ArrayList<Double> getDoubleList()
	{
		ArrayList<Double> list=new ArrayList<Double>();
		list.add(5.5);
		list.add(7.7);
		list.add(8.8);
		return list;
	}
	
	public static  ArrayList<String> getStrList()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Sunbeam");
		list.add("Pune");
		list.add("Karad");
		return list;
	}
	
	
	
	public static void printList(ArrayList<? extends Number> list) //Upper BOUNDED WILD CARD 
	{
		for(Object ele : list)
			System.out.print(ele+"\t");
	}
	
	
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> intList=new ArrayList<Integer>();
		ArrayList<Double> doubleList=new ArrayList<Double>();
		ArrayList<String> strList=new ArrayList<String>();
		
		intList = getIntList();
		printList(intList);
		System.out.println();
		
		doubleList = getDoubleList();
		printList(doubleList);
		System.out.println();
		strList = getStrList();
		//printList(strList); //javac error // ? extends Integer
		// String is not an Integer 
		
	}

}
