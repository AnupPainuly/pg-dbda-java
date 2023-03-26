//avoiding NullPointerException in array and function.

import java.util.Scanner;

public class Day5_8 {
	static void accept_arr(int arr[]) {
		if (arr!=null) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the array ele: ");
			for(int i=0;i<4;i++) {
				arr[i]=sc.nextInt();
			}//end of for loop
		}//end of if
		else
			System.out.println("array is null");
	}//end of accept_arr func

	static void display_arr(int arr[]) {
		if (arr!=null) {
			System.out.println("displaying array ele");
			for(int i : arr) {
				System.out.printf("%d ",i);
			}
		 }
		else
			System.out.println("array is null");
		
	}
	public static void main(String[] args) {
		int a[]=new int[4];
		int b[]=null;
		
		accept_arr(a);
		display_arr(a);
		System.out.println();
		accept_arr(b);
		display_arr(b);
		
	}

}
