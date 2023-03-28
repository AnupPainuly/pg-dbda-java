//Assignment:Day1-#9
//Objective:
//Find the compound interest n the amount 
//Accept principle , interest rate n time period in years from user , using scanner.
//Formula : 
//Compound Interest=Principle*(1+(rate / 100))^time – Principle
//time : time period in years.

import java.util.Scanner;
class CompoundInterest {
	public static double ciCalc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle");
		double p=sc.nextDouble();
		System.out.println("enter the interest rate");
		double r=sc.nextDouble();
		System.out.println("enter the time period in years");
		double n=sc.nextDouble();
		double result=p*Math.pow((1+(r/100)),n);
		sc.close();
		return result;
	}
}
