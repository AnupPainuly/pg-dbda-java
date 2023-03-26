import java.util.ArrayList;

//The class which implements Cloneable interface 
// that class can call clone() method
// internally it goes to Object.clone() 

// MARKER INTERFACE : Any interface having zero number of method declarations 
// CLONEABLE is marker interface 


public class Day11_8 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		ArrayList<Integer> a3=a1; // reference copy // shallow copy 
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a2.add(4);
		a2.add(5);
		a2.add(6);
		System.out.println("A1 = "+a1+" Hashcode = "+a1.hashCode());
		System.out.println("A2 = "+a2+" Hashcode = "+a2.hashCode());
		System.out.println("A3 = "+a3+" Hashcode = "+a3.hashCode());
		
		ArrayList<Integer> a4 =(ArrayList<Integer>) a1.clone(); 
		// deep copy 
		System.out.println("A4 = "+a4+" Hashcode = "+a4.hashCode());
		a1.add(88);
		System.out.println("***********");
		System.out.println("A1 = "+a1+" Hashcode = "+a1.hashCode());
		System.out.println("A2 = "+a2+" Hashcode = "+a2.hashCode());
		System.out.println("A3 = "+a3+" Hashcode = "+a3.hashCode());
		System.out.println("A4 = "+a4+" Hashcode = "+a4.hashCode());
		
		
		
		

	}

}
