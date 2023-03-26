
//Command Line Arguments 


public class Day2_5 
{
    public static void main(String args[])
    {
        String org=args[0];
        String name=args[1];
        int year=Integer.parseInt(args[2]);
        // Inside Integer class (from java.lang)
        // public static int parseInt(String s) declaration
        System.out.println("Organization = "+org);
        System.out.println("Name = "+name);
        System.out.println("Year = "+year);
    }

}