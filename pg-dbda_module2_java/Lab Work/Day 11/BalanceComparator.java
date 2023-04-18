package account;

import java.util.Comparator;

public class BalanceComparator
implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		return o1.getBalance().compareTo(o2.getBalance());
	}
	
	/*
	 * public static int compare(long o1, long o2) {
        return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
    }

	 */
	
}