package account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesterSorting {
	public static void main(String[] args) throws InvalidAccountDetailsException {
		List<BankAccount> accounts = new ArrayList<BankAccount>();
		for(int i =5; i>0;i--) {
			accounts.add(new BankAccount(i, (10000*(i+1)), "FD", "bac"+i));
		}
		Collections.sort(accounts);
		System.out.println(accounts);
		
		Collections.sort(accounts, new BalanceComparator());
		System.out.println(accounts);
	}
}
