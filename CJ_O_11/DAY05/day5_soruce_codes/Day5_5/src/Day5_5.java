
public class Day5_5 {

	public static void main(String[] args) 
	{
		int arr1[]=null; //valid 
		int[] arr2=null; // valid 
		int arr3[]=new int[4]; //valid 
		//int [arr4] =null; //invalid // javac error 
		//int[] arr = new int[-5]; //not valid 
		// NegativeArraySizeException 
		int arr5[]= {10,20,30,40,50}; //valid // array initialization
		int arr6[]=new int[] {11,22,33,44}; //valid // array initialization
		//int arr7[]=new int[3] {1,2,3}; // Invalid 
		

	}

}
