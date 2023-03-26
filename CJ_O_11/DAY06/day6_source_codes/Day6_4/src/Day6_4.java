
// creation of user defined enum
// if we try to add some data on enum constants
// we must specify constructor of our own


enum Day
{
	
	SUN(1,"Sunday"),MON(2,"Monday"),TUE(3,"Tuesday");
	int dayNumber;
	String dayName;
	Day(int dayNumber,String dayName)
	{
		this.dayNumber=dayNumber;
		this.dayName=dayName;
	}
	
	int getDayNumber()
	{
		return this.dayNumber;
	}
	
	String getDayName()
	{
		return this.dayName;
	}
	
}

public class Day6_4 {

	public static void main(String[] args)
	{
		System.out.println("Name = "+Day.SUN.name());
		System.out.println("Ordinal Value ="+Day.SUN.ordinal());
		System.out.println("Get Day Number = "+Day.SUN.getDayNumber());
		System.out.println("Get Day Name = "+Day.SUN.getDayName());
	}

}
