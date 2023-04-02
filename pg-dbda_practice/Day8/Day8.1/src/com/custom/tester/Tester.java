package com.custom.tester;

import com.banking.BankAccount;
import com.banking.utils.Validation;

import java.util.Arrays;
import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("enter no of bank accounts to be created");
			BankAccount[] acc = new BankAccount[sc.nextInt()];//creating a array of references
			for(int i=0;i<acc.length;i++) {
				System.out.println("enter the bank details: 1. account number 2. customer name 3. account balance 4. account type ");
				BankAccount bc = new BankAccount(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next());
				System.out.println(bc.toString());
				Validation.validateAccount(bc.getBalance(),bc.getAccountType());
			}//end of for loop

		}//end of try-with resources block
		catch(Exception e) {
			e.printStackTrace();
		}//end of catch block



	}//end of main

}//end of tester Class
