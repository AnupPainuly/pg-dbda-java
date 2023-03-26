import java.util.Scanner;
enum Color
{
    RED,BLUE,GREEN;
}
public class EnumExample 
{
    static Color getChoice()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice");
        int choice = sc.nextInt();
        return Color.values()[choice-1]; //Color.values()[1]

    }
    public static void main(String args[])
    {
        Color clr = getChoice();
        System.out.println(clr);
        //to do by adding switch case 
    }

}