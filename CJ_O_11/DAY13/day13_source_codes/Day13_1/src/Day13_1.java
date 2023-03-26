import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;

	@Override
	public int compareTo(Movie o) 
	{
		return this.year-o.year;
	}
	
	public Movie(double rating,String name,int year)
	{
		this.rating=rating;
		this.name=name;
		this.year=year;
	}

	
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}
	
	
}

//class to compare Movie Ratings
class RatingCompare implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) 
	{
		if(o1.getRating() <o2.getRating())
			return -1;
		if(o1.getRating()>o2.getRating())
			return 1;
		return 0;

	}
	
}




//class to compare Movie based on names

class NameCompare implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) 
	{
		return o1.getName().compareTo(o2.getName());
	}
	
}




public class Day13_1 {

	public static void main(String[] args) 
	{
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie(4.5,"ABC",2020));
		list.add(new Movie(3.5,"PQR",2019));
		list.add(new Movie(3.2,"DEF",2017));
		list.add(new Movie(3.0,"EFG",2023));
		
		for(Movie m : list)
			System.out.println(m);
		System.out.println("Sort Array List based on year");
		Collections.sort(list);
		for(Movie m : list)
			System.out.println(m);
		
		RatingCompare rc = new RatingCompare();
		System.out.println("Sort Array List based on Rating");
		Collections.sort(list,rc);
		for(Movie m : list)
			System.out.println(m);
		
		System.out.println("Sort Array List based on Name");
		NameCompare nc=new NameCompare();
		Collections.sort(list,nc);
		for(Movie m : list)
			System.out.println(m);
		
		
		
	}

}
