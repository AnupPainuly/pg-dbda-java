package account;

public class Main {
	public static void main(String[] args) {
		int maxAccounts = 5;// user
		BankAccount[] accounts = new BankAccount[maxAccounts];
		int choice = 1; // user
		int index=0;
		try {
			while (true) {

				switch (choice) {
				case 1:
					if(index<maxAccounts)
						accounts[index++] = new BankAccount(12345, 2000, "SAVINGS", "firstName");
					else
						throw new RuntimeException("maxAccounts reached:");
					break;
				case 2:
						int withdrawBal = 100; //user
						int acctNumber = 12345; //user
						if(!UtilityRulesValidation.checkNegativeBalance(withdrawBal)) {
							BankAccount withdrawAccount = new BankAccount(acctNumber);
							boolean validAcct = false;
							int i=0;
							for(BankAccount ba : accounts) {
								if(i < index) {
									if(ba.equals(withdrawAccount)) {
										ba.withdraw(withdrawBal);
										validAcct=true;
									}
								}else {
									break;
								}
								i++;
							}
							if(!validAcct) {
								throw new RuntimeException("AccountNumber or Withdrawal Balance not right:");
							}
						}
						
					else
						throw new RuntimeException("maxAccounts reached:");
					break;
				default:
					System.exit(0);
				}

			}
		} catch (InvalidAccountDetailsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
