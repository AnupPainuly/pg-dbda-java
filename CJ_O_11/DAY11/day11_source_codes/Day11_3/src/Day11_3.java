import java.util.ArrayList;

public class Day11_3 
{
	public static void main(String args[])
	{
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		int data[]= {10,20,25,30,35,40,45,50,55,60};
		
		
		System.out.println("Adding Array to ArrayList");
		
		for(int i : data)  
			al.add(i); 
		System.out.println("Array List = "+al);
		al.add(4,999);
		System.out.println("Array List after adding elemetn  = "+al);
		al.add(0,888);
		System.out.println("Array List = "+al);
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.addAll(al);
		System.out.println("Second Array List = "+al2);
		System.out.println("Get(3) = "+al.get(3));
		System.out.println("Index of 45 = "+al.indexOf(45));
		System.out.println("Is empty = "+al.isEmpty());
		System.out.println("Contains = "+al.contains(55));
		
		System.out.println("Contains = "+al.contains(444));
		System.out.println("Remove "+al.remove(1));
		System.out.println("AL = "+al);
		
	}
}

		