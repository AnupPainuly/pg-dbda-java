
//array and functions

import java.util.Scanner;

public class Day5_7 {
	static void accept_arr(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the ele");
		for(int i=0;i<4;i++) {
			arr[i]=sc.nextInt();
		}
	}
	static void display_arr(int arr[]) {
		System.out.println("displaying ele");
		for(int i=0;i<4;i++) {
			System.out.printf("%d ",arr[i]);
		}
	}
	public static void main(String[] args) {
		int a[]=new int[4];
		int b[]=new int[4];
		accept_arr(a);
		display_arr(a);
		System.out.println();
		accept_arr(b);
		display_arr(b);

		
	}

}
