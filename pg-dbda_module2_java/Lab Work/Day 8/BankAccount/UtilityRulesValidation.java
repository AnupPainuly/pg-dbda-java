package account;

public class UtilityRulesValidation {

	public static final int MIN_BALANCE = 1000;
	public static final String[] ACCT_TYPE = new String[] {"SAVINGS", "CURRENT","LOAN","FD"}; 

	public static boolean checkBalance(double balance) {
		boolean minBalFlag = false;
		if(balance>MIN_BALANCE) {
			minBalFlag=true;
		}
		return minBalFlag;
	}
	
	public static boolean checkNegativeBalance(double balance) {
		boolean negativeBalanceFlag = false;
		if(balance<0) {
			negativeBalanceFlag=true;
		}
		return negativeBalanceFlag;
	}
	
	public static boolean checkAcctType(String acctType) {
		boolean validAcctType=false;
		for(String tempAcctType : ACCT_TYPE) {
			if(acctType.equals(tempAcctType)) {
				validAcctType=true;
				break;
			}
		}
		return validAcctType;
	}
}
