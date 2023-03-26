//methods from class Arrays of package java.util
import java.util.Arrays;
public class Day5_10 {
	public static void main(String[] args) {
		int array[]=new int[] {7,4,9,2,11,3};
		System.out.println("before sorting- "+Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("after sorting- "+Arrays.toString(array));
		
		//using binarysearch on sorted array because that is the way it is.
		int index = Arrays.binarySearch(array, 11); //search for ele `11` in the array.
		System.out.printf("%d", index);
		
		int dest[] = Arrays.copyOfRange(array, 2, 4); //2nd index upto but not including 4th index
		System.out.println("dest array-"+Arrays.toString(dest));

	}

}
