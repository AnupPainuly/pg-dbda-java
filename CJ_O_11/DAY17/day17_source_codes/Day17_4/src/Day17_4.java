import java.util.Arrays;
import java.util.List;

// create a class Animal (name,color)
// create a collection of objects
// convert collection in stream
// filter out animal name whose name is "Tommy"
// map this animal's Name
// find out the animal
// or else 

public class Day17_4 
{

	static void getDogsNames()
	{
		Animal a1=new Animal("Tim","Black");
		Animal a2=new Animal("Tommy","Brown");
		Animal a3=new Animal("Zim","white");
		
		
		List<Animal> l1=Arrays.asList(a1,a2,a3);
		
		// convert all the elements in stream
		String dogName = l1.stream().filter(name -> "Tommy".equals(name.getName()))
		.map(Animal::getName)  // method reference 
		.findAny()
		.orElse("no animal found with name tommy");
		
		System.out.println("Dog Name = "+dogName);
		
		
		dogName = l1.stream().filter(name -> "Tom".equals(name.getName()))
				.map(e -> e.getName()) // lambda 
				.findAny()
				.orElse("no animal found with name tommy");
				System.out.println("Dog Name = "+dogName);
		
	}
	
	public static void main(String[] args)
	{
		getDogsNames();

	}

}
