package com.boxing.day;

import java.util.Scanner;//importing the Scanner class from java.util package.
public class TestBox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the box dimensions");
		Box b1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());//creating object b1 of class Box
		System.out.println(b1.getBoxDims());
		System.out.println(b1.getBoxVol());
		sc.close();//releasing the scanner
		
	}//end of main method

}//end of TestBox class
