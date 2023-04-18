package account;

import java.util.Comparator;

public class BankAccount implements Comparable<BankAccount>{

	private Long accountNumber;//object reference
	private Double balance;
	private String acctType;
	private String firstName;

	public BankAccount(long accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public BankAccount(long accountNumber, double balance, String acctType, String firstName)
			throws InvalidAccountDetailsException {

		if (!UtilityRulesValidation.checkBalance(balance))
			throw new InvalidAccountDetailsException("Invalid Balance: ");
		if (!UtilityRulesValidation.checkAcctType(acctType))
			throw new InvalidAccountDetailsException("Invalid Acct Type: ");

		this.accountNumber = accountNumber;
		this.balance = balance;
		this.acctType = acctType;
		this.firstName = firstName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", acctType=" + acctType
				+ ", firstName=" + firstName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 * if (this == obj) return true; if (obj == null) return false; if (getClass()
		 * != obj.getClass()) return false;
		 */
		BankAccount other = (BankAccount) obj;
		return accountNumber == other.accountNumber;
	}

	public void withdraw(int withdrawBal) {
		double temp = this.balance - withdrawBal;
		if (UtilityRulesValidation.checkBalance(temp)) {
			this.balance = temp;
		}
	}

	@Override
	public int compareTo(BankAccount o) {
		return this.accountNumber.compareTo(o.accountNumber);
	}

	

	

}
