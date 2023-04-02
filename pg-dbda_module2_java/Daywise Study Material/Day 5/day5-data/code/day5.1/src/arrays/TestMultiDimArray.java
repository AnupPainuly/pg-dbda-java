package arrays;

import java.util.Arrays;

public class TestMultiDimArray {

	public static void main(String[] args) {
		// Create 2 D array to store the ints with value : from 10 onwards
		// row : 4 , col : 3
		int value = 10;
		int[][] data = new int[4][3];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[i].length; j++)
				data[i][j] = value++;
		// display the array data : using for-each
		System.out.println("Array data using for-each");
		for (int[] i : data) {
			for (int j : i) {
				System.out.println(i);
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// display the array data : using for loop
		System.out.println("Array data using for");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		// print complete data of nested array using method of java.util.Arrays
		System.out.println("Printing array contents using Arrays.deepToString");
		System.out.println(Arrays.deepToString(data));
		// example of direct init of 2D array of doubles
		double[][] doubles = { { 1.5, 2.5 }, { 1.1, 2.1 }, { 5.6, 7.6 } };
		System.out.println(Arrays.deepToString(doubles));
		// example of direct init of 2D array of doubles : jagged(non rectangular
		// arrays)
		double[][] doubles2 = { { 1.5, 2.5 }, { 1.1, 2.1, 2.8 }, { 5.6, 7.6, 8.6, 9.6 } };
		System.out.println(Arrays.deepToString(doubles2));

	}

}
