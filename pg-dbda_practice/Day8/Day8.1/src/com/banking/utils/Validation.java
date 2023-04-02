package com.banking.utils;

import com.custom.exceptions.*;
public class Validation {
	private static final double MIN_BALANCE;
	private static String[] ACCOUNTTYPE;

	static {
		MIN_BALANCE=1000;
		ACCOUNTTYPE= new String[] {"SAVINGS","LOAN"};
	}//end of static initializer block

	public static void validateAccount(double balance, String type) throws LowBalanceAlert, IncorrectAccountType {
		if(balance < MIN_BALANCE ) {
			throw new LowBalanceAlert("running low balance");
		}//end of if
		for(String at:ACCOUNTTYPE) {

			if(at.equals(type)) {
				throw new IncorrectAccountType("no such account exist!");
			}//end of if
		}
		System.out.println("creation can be intiated");

	}//end of validatAccount method
	
	public void deposit() {
		System.out.println("amount deposited");
	}//end of deposit

	public void withdraw() {
		System.out.println("amount withdraw");
	}//end of deposit

}//end of Validation class
