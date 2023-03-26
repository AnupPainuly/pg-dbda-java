import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>
{
	double rating;
	String name;
	int year;
	
	public Movie(double rating, String name, int year) 
	{
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	@Override
	public int compareTo(Movie o)
	{
		
		return this.year - o.year;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}
	
	
	
}
public class Day12_10 {

	public static void main(String[] args) 
	{
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie(4.5,"ABC",2020));
		list.add(new Movie(3.5,"PQR",2019));
		list.add(new Movie(3.2,"DEF",2017));
		list.add(new Movie(3.0,"EFG",2023));
		
		for(Movie m : list)
			System.out.println(m);
		System.out.println("Sort Array List");
		Collections.sort(list);
		for(Movie m : list)
			System.out.println(m);
		

	}

}
