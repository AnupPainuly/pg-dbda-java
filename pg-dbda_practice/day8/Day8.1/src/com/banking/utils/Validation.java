package com.banking.utils;

import com.banking.BankAccount;
import com.custom.exceptions.*;

public class Validation {
	private static final double MIN_BALANCE;
	private static final String[] ACCOUNTTYPE;

	static {
		MIN_BALANCE = 1000;
		ACCOUNTTYPE = new String[] { "SAVINGS", "LOAN", "CURRENT", "FD" };
	}// end of static initializer block

	public static BankAccount validateAllRules(int accountNumber, String customerName, double balance,
			String accountType) throws IncorrectBankDetails {
		validateBalance(balance);
		validateAccountType(accountType);
		return new BankAccount(accountNumber, customerName, balance, accountType);

	}// end of validateAllRules

	public static void validateBalance(double balance) throws IncorrectBankDetails {
		if (balance < MIN_BALANCE) {
			throw new IncorrectBankDetails("running low balance");
		} // end of if

	}// end of validatBalance method

	public static void validateAccountType(String acctype) throws IncorrectBankDetails {
		boolean available = false;
		for (String s : ACCOUNTTYPE) {
			if (s.equalsIgnoreCase(acctype))
				available = true;
		}
		if (!available)
			throw new IncorrectBankDetails("Account type does not exist");
	}// end of validateAccountType

	public void deposit() {
		System.out.println("amount deposited");
	}// end of deposit

	public void withdraw() {
		System.out.println("amount withdraw");
	}// end of deposit

}// end of Validation class
