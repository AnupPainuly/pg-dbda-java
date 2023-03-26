//Objective: write application to accept empid, salary, name, employemnt status(boolean)
import java.util.Scanner; //importing scanner class from java.util package.
public class EmpDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //create a scanner object.
        System.out.print("enter the name: ");
        String name = sc.next();//this will read the std input.
        System.out.print("enter the employee id: ");
        int empid = sc.nextInt();//this will parse the std input to int.
        System.out.print("enter the salary: ");
        float salary = sc.nextFloat();
        System.out.print("enter the status: ");
        boolean status = sc.nextBoolean();
        System.out.println("Employee Details:"+name+" "+empid+" "+salary+" "+status);

    }
}
