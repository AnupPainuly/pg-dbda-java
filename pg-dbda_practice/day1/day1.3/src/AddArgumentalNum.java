//Objective: Accept two numbers as cmd line args and add them then display the result.
public class AddArgumentalNum{
    public static void main(String[] args){
        int num1=Integer.parseInt(args[0]); //parseInt is method from class Integer of package java.lang which is a default package.
        int num2=Integer.parseInt(args[1]);
        System.out.println("Addition: "+(num1+num2));

    }

}
