import java.util.HashSet;

//set does not allow duplicate elements

//HashSet
public class Day13_3 {

	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(220);
		hs.add(115);
		hs.add(340);
		hs.add(450);
		hs.add(99);
		hs.add(220); //duplicate value is not allowed
		hs.add(null); // only one null value is allowed 
		hs.add(null);
		System.out.println(hs);

	}

}
