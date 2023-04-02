package account;

public class BankAccount {

	private long accountNumber;

	public BankAccount(long accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + "]";
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

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static void main(String[] args) {
		BankAccount obj1 = new BankAccount(1234567890);
		BankAccount obj2 = new BankAccount(1234567890);
		System.out.println(obj1.equals(obj2));//
	}

}
