//Assignment:day1-#8
//8.Accept range of numbers (begin value & end value) from user , using scanner.
//Print all even nos from the range
//Try writing the functionality of checking for even number in a method n call it from main

import java.util.Scanner;
public class EvenOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the starting range: ");
		int start=sc.nextInt();
		System.out.print("enter the starting range: ");
		int end=sc.nextInt();
		System.out.println("The even numbers from the give range:");
		for(int i=start;i<=end;i++) {
			if(isEven(i)) {
				System.out.print(i+" ");
			}	
		}
		sc.close();//closing the scanner
	}//end of main 
	public static boolean isEven(int n) {
		if(n%2!=0) {
			return false;
		}
		return true;
	}//end of isEven function

}//end of class EvenorNot
