import java.util.Arrays;

public class Day5_9 {
	public static void main(String[] args) {
		int arr[]=new int[] {31,424,646,434,653};
		
		System.out.println("printing using traditional for loop");
		for(int i=0;i<4;i++) {
			System.out.printf("%d ",arr[i]);
		}
		
		System.out.println("printing using advanced for loop");
		for(int i : arr) {
			System.out.printf("%d ",i);
		}
		
		System.out.println("Print the elements using toString() form Class Arrays");
		System.out.println(Arrays.toString(arr));
	}
}

/*
public class Day5_9 {
	public static void main(String[] args) {
		boolean barray[]=new boolean[3];
		int iarray[]=new int[3];
		float farray[]=new float[3];
		double darray[]=new double[3];
		
		System.out.println(barray); //this will call toString method of object class since we do not have our own. barray.toString()
		System.out.println(iarray); //this will call toString method of object class since we do not have our own. iarray.toString()
		System.out.println(farray); //this will call toString method of object class since we do not have our own. farray.toString()
		System.out.println(darray); //this will call toString method of object class since we do not have our own. darray.toString()
		
	}

}
*/