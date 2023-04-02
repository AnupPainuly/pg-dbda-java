package com.arrays;

public class TestDynamicInitArrays {
	public static void main(String[] args) {
		//creating the array of doubles.
		//direct initialization of array OR dynamic init of array of primitive type.
		double[] arr = {1.5,3.5,43.3,6.3}; //note the missing new operator. we are not creating the object  hence dynamic initialization
		String[] names = {"acvsf","lwrw","ljflj"};//string literal arrays;//string literal arrays
		System.out.println(arr);
		System.out.println(names);
		
	}//end of main


}//end of class TestDynamicInitArrays
