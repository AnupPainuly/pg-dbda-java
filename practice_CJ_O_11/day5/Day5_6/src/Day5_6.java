//take input and display output of int and float arrays 
import java.util.Scanner;
public class Day5_6 {
	public static void main(String[] args) {
		int arr[] = new int[4];
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the array elements of `int` type");
		for(int i=0;i<4;i++) {
			arr[i]=sc.nextInt();
		}// end of loop that takes input for int array ele.
		
		//advanced for loop is only used for interating and displaying elements
		for(int i : arr) {
			System.out.printf("%d ",i);
		}

	}
}
/*
public class Day5_6 {
	public static void main(String[] args) {
		int arr[] = new int[4]; //decl and initialization of array
		float farr[] = new float[4];//decl and initialization of array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements of `int` type");
		for(int i=0;i<4;i++) {
			arr[i]=sc.nextInt();
		}// end of loop that takes input for int array ele.
		
		System.out.println("Enter the array elements of `float` type");
		for(int i=0;i<4;i++) {
			farr[i]=sc.nextFloat();
		}//end of loop that takes input for float array ele.
		
		//displaying int array ele
		for(int i=0;i<4;i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println();
		for(int i=0;i<4;i++) {
			System.out.printf("%.2f ",farr[i]);
		}


		
	}
	
}
*/

/*
public class Day5_6 {
	public static void main(String[] args) {
		int arr[]=new int[4];
		System.out.printf("%d ",arr[0]); //initialized to 0
		System.out.printf("%d ",arr[1]); //initialized to 0
		System.out.printf("%d ",arr[2]); //initialized to 0
		System.out.printf("%d ",arr[3]); //initialized to 0
		System.out.println("\nprinting form for loop");
		
		for(int i=0;i<4;i++) {
			System.out.printf("%d ",arr[i]);
		}
	}
}
*/