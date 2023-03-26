package p1;

public class Day19_8 {

	public static void main(String[] args) 
	{
		Account acc = new Account(123,"Saving",45000.0);
		final double amount = 1000.0;
		
		Thread dt = new Thread(() ->  {
			for(int i=1;i<=5;i++)
			{
				acc.deposit(amount);
				System.out.println("After Deposit = "+acc.getBalance());
				Util.delay(1000);
			}
			
		});
		dt.start();
		
		Thread wt = new Thread(() ->  {
			for(int i=1;i<=5;i++)
			{
				acc.withdraw(amount);
				System.out.println("After Withdraw = "+acc.getBalance());
				Util.delay(1000);
			}
			
		});
		wt.start();
		
		
			try 
			{
				dt.join();
				wt.join();
			} 
			catch (InterruptedException e) 
			{

				e.printStackTrace();
			}
			
		System.out.println("\n Final Balance = "+acc.getBalance());		
		
	}

}
