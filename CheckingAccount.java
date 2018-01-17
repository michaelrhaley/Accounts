
public class CheckingAccount extends Account
{
	@Override
	public double processWithdrawal(double withdrawalAmount)
	{
		balance = balance - withdrawalAmount;
		if(balance < 0)
		{
			System.out.println("Overdraft fee charged ");
			balance = balance - 10;
		}
		return balance;
	}
	
	public String displayAccount()
	{
		String str;
		str = "Account Type: Checking";
		str += "Account #: " + getAccountID();
		str += "Account Name: " + getAccountName();
		str += "Account Balance: $%.2f%n" + getBalance();
		return str;	
	}
	
	
	
	
	
	
	
	
	

}
