import java.util.ArrayList;

//Created ArryaList
//ArrayList
// unsorted, Ordered (the way we inserted values the sequence is maintained)
// AL is allowing multiple values
// AL allowing repeated values 


/*

public class Day11_1 {

	public static void main(String[] args) 
	{
		ArrayList<Float> al=new ArrayList<Float>();
		//al is of Float type ==> NP type
		al.add(2.3f);
		al.add(3.3f);
		al.add(4.3f);
		al.add(5.3f);
		//al.add(8.9); // NOT ALLOWED javac error 
		
		//al ===> Float ==> NP
		//inside for loop float ===> P 
		// NP to P conversion is done implicitly
		// Auto Unboxing 
		for(float f : al)
			System.out.print(f+"\t");
		
	}
	
}

*/



/*
public class Day11_1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(25); //25 is actually considered as Integer (reference type)
		al.add(30);
		al.add(5);
		al.add(10);
		al.add(25);
		//al is a reference type 
		// int element ==> p type
		// al ==> NP type
		
		//NP to P conversion 
		// Auto Unboxing
		for(int element : al)
			System.out.print(element + "\t");
	}
}
*/


/*
public class Day11_1 {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(); // al is of RAW TYPE
		// not recommended
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add("Sunbeam");
		al.add(5.5f);
		al.add(6.7);
		//Object (super class) ==> String (sub class)
		// UPCASTING
		for(Object element : al)
			System.out.print(element+"\t");
		
	}
}

*/

/*

public class Day11_1 {

	public static void main(String[] args) 
	{
		int[] arr=new int[5]; // arr is an array of int type(primitive)
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int element : arr)
			System.out.print(element+"\t");
	
		
	}

}

*/
