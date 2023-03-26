import java.util.Scanner;

public class Day5_6 {

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you wish to insert in an array");
		n=sc.nextInt();
		float farr[]=new float[n];
		System.out.println("Enter Array elements :");
		for(int i=0;i<n;i++)
			farr[i]=sc.nextFloat();
		System.out.println("Array Elements are");
		
		//i = farr[0]   
		// i =farr[1]
		//......
		// i =farr[n-1] 
		
		//for each element "i" of type "float"
		// inside the array "farr" 
		// print the element "i"
		for(float i: farr)
			System.out.print(i+"\t");
		
	}
}


/*
public class Day5_6 {

	public static void main(String[] args)
	{
		int arr[]=new int[4];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array elements (int type):");
		for(int i=0;i<4;i++)
			arr[i]=sc.nextInt();
	
		//advanced for loop 
		//it is used for traversing the complete collection from start to end 
		System.out.println("Array elements :");
		
		//for each element "ele" of type "int" 
		// inside the array "arr"
		//please print the each element "ele"
		//ele = arr[0]  ele = arr[1]  ele = arr[2] ele = arr[3] ... 
		// ele = arr[0]  till ele = arr[n-1]
		for(int ele : arr)
			System.out.print(ele +"\t");
	
	}
	
}

*/
/*
public class Day5_6 {

	public static void main(String[] args)
	{
		int arr[]=new int[4];
		float farr[]=new float[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array elements (int type):");
		for(int i=0;i<4;i++)
			arr[i]=sc.nextInt();
		
		
		
		System.out.println("Enter Array elements (float type) :");
		for(int i=0;i<4;i++)
			farr[i]=sc.nextFloat();
		
		System.out.println("Array elements :");
		for(int i=0;i<4;i++)
			System.out.printf(arr[i]+"\t");
		
		System.out.println();
		
		System.out.println("Array elements :");
		for(int i=0;i<4;i++)
			System.out.printf(farr[i]+"\t");
		
		
	
	}
}
*/

/*
public class Day5_6 {

	public static void main(String[] args)
	{
		int arr[]=new int[4];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		for(int i=0;i<4;i++)
			System.out.print(arr[i]+"\t");
	}

}

*/
 
