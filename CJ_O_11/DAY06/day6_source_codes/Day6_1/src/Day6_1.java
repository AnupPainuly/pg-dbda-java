import java.util.Scanner;

//RAGGED ARRAY 
public class Day6_1 {

	public static void main(String[] args) 
	{
		int a[][]=new int[][] {{11,22,33,44},{10,20},{60,70,80,90,100},{5,4,3}};
		// total 4 rows
		// row1 ==> length = 4
		//row2 ==> length = 2
		//row3 ==>length = 5
		// row4 ==> length = 3 
	}
}




/*
//2D array

//display 2D array using advanced for loop

public class Day6_1 {

	public static void main(String[] args) 
	{
		int a[][]=new int[][] {{11,22,33},{44,55,66},{77,88,99}};
		for(int row[] : a)
		{
			for(int col : row)
				System.out.println(col+"\t");
		}
		
	}
}

*/


/*
public class Day6_1 {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]= sc.nextInt();
			}
		}
		
		
		System.out.println("Array Elements are : ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}
}

*/



/*
public class Day6_1 {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
		System.out.println("Length = "+arr.length);
		System.out.println("Length of arr[0] = "+arr[0].length);
		System.out.println("Length of arr[1] = "+arr[1].length);
		System.out.println("Length of arr[2] = "+arr[2].length);
		
	}
	
	}
	
	*/



/*
public class Day6_1 {

	public static void main(String[] args) {
		int[][] a1 = new int[4][3]; // valid statment
		//4 rows //3 cols 
		
		//int a2[3][2] = new int[3][2]; //invalid 
		int a2[][] = new int[3][2]; //valid 
		int a3[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}}; // OK
		
		int a4[][]=new int[6][]; // invalid 
		int arr[][]= new int[3][3]{{1,2,3},{4,5,6},{7,8,9}}; // NOT OK
		
		

	}

}
*/