/*2. Netbanking Login
i/p : account no n pin (For this , will you modify your equals method ? I hope not !)
o/p : login successful or invalid login (throw custom exc )*/

0. boolean login = false; //initialize above the while(true)
1. get account number from user => tempAccNum
2. get pin from user => tempPin
3. Iterate ArrayList (ArrayList<BankAccount> accounts)
   for( BankAccount account: accounts){
	   if(account.getAccountNumber()==tempAccNum){
		   if(account.getPin().equals(tempPin){
			   login=true;
		   }else{
			   login=false;
		   }
	   }else{
			   login=false;
       }
   }
   
   if(!login){
	   throw new RuntimeException("Invalid Login Details ---");	   
   }


