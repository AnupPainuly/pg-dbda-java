package com.banking.utils;

import com.banking.BankAccount;
import com.custom_Exception.InvalidBankDetailsException;

public class Validation {
	private static final double BALANCE;
	private static final String[] ACCOUNTTYPE;

	static {
		BALANCE = 1000;
		ACCOUNTTYPE = new String[] { "SAVINGS", "FD", "CURRENT", "LOAN" };
	}// end of static initializer block

	public BankAccount validateAll(String accountNumber, String customerName, String accountType, double balance) throws InvalidBankDetailsException{
		validateBalance(balance);
		validateAccountType(accountType);
		return new BankAccount(accountNumber, customerName, accountType, balance);
	}//end of validateAll method
	
	public double validateBalance(double balance) throws InvalidBankDetailsException {
		if (balance < BALANCE) {
			throw new InvalidBankDetailsException("Low Balance Alert!");
		}
		return balance;
	}// end of validateBalance method

	public String validateAccountType(String accounttype) throws InvalidBankDetailsException {
		boolean available = false;
		for (String a : ACCOUNTTYPE) {
			if (a.equalsIgnoreCase(accounttype)) {
				available = true;
			}
		}
		if (!available)
			throw new InvalidBankDetailsException("Account type does not exists!");
		return null;
	}//end of validateAccountType method

}
