//Assignment:Day1-#8
//Objective:
//Accept range of numbers (begin value & end value) from user , using scanner.
//Print all even nos from the range
//Try writing the functionality of checking for even number in a method n call it from main
import java.util.Scanner;
public class PrimeOrNot{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the starting range: ");
		int start=sc.nextInt();
		System.out.print("enter the ending range: ");
		int end=sc.nextInt();
		System.out.println("The prime numbers in the given range: ");
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}//end of for
		sc.close(); //closing the scanner
	}//end of main function
	public static boolean isPrime(int n) {
		if(n<=0) {//following the fact that 1 is not a prime number.
			return false;//not a prime number
		}//end of if
		for(int i=2;i<=Math.sqrt(n);i++) { //checking prime upto sqrt of the number.
			if(n%i==0) {
				return false;
			}//end of if
		}//end of for
		return true;
	}//end of function
}//end of Class PrimeorNot 
