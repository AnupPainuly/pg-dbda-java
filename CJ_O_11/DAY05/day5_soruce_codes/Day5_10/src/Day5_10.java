//methods of Arrays class

import java.util.Arrays;

public class Day5_10 {

	public static void main(String[] args)
	{
		int a[]=new int[] {500,120,130,240,150};
				
		System.out.println("Before Sort ="+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sort ="+Arrays.toString(a));
		
		int index = Arrays.binarySearch(a, 240);
		System.out.println("Index = "+index);
		
		int dest[]=Arrays.copyOfRange(a,2, 4);
		
		System.out.println("Dest array ="+Arrays.toString(dest));
	}
}
