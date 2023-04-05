package com.banking;

import java.util.Objects;

public class BankAccount {
	private int accountNumber;
	private String customerName;
	private double balance;
	private String accountType;
	
	public BankAccount(int accountNumber, String customerName, double balance, String accountType) {
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.balance=balance;
		this.accountType=accountType;
	}//end of constructor
	
	public double  getBalance() {
		return balance;
	}//end of getter
	
	public String getAccountType() {
		return accountType;
	}//end of getter

	@Override
	public String toString() {
		return "[ accountNumber: "+accountNumber+" customerName: "+customerName+" Account type"+accountType+" balance: "+balance+"]";
	}// end of toString method


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return accountNumber == other.accountNumber;
	}//end of equals method
	 

}//end of BankAccount class
