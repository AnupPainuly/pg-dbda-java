package sets;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		String[] names = { "Meera", "Mahesh", "Sameer", "Samantha", 
				"Riya", "Keerti", "Shubham", "Anish","Meera","Sameer"};
		//create empty TreeSet n populate names
		TreeSet<String> stringSet=new TreeSet<>();
		for(String s : names)
			System.out.println("Added "+stringSet.add(s));
		//display HS
		System.out.println("size "+stringSet.size());
		System.out.println("HS contents : ");
		for(String s : stringSet)
			System.out.println(s);

	}

}
