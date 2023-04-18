package test_enums;

import java.util.Scanner;

public class TestEnum {

	public static void main(String[] args) {
		// 1. Display all colors
		for (Color c : Color.values())
			System.out.println(c);// toString / name()
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Choose a color");
			Color chosenClr = Color.valueOf(sc.next().toUpperCase());
			System.out.println("You chose " + chosenClr.name() 
			+ " pos " + chosenClr.ordinal());
		//	Color clr=new Color(4567);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
