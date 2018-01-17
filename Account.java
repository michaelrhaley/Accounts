
public class Account 
{
	protected String accountName;
	protected int accountID;
	protected double balance;
	
	public Account()
	{
		System.out.println("Account Constructor called");
		accountName = "none";
		accountID = 9999;
		balance = 0;
	}
	
	public Account(String actName, int actID, double actBal)
	{
		System.out.println("Account Overloaded Constructor called");
		accountName = actName;
		accountID = actID;
		balance = actBal;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double processDeposit(double depositAmount)
	{
		
		balance = balance + depositAmount;
		return balance;
	}
	
	public double processWithdrawal(double withdrawalAmount)
	{
		balance = balance - withdrawalAmount;
		return balance;
	}
	
	public String getAccountName()
	{
		return accountName;
	}
	
	public int getAccountID()
	{
		return accountID;
	}
	
	public void setAccountName(String accountName)
	{
		this.accountName = accountName;
	}
	
	public void setAccountID(int accountID)
	{
		this.accountID = accountID;
	}
	
	
	public String displayAccount()
	{
		String str;
		str = "Account #: " + getAccountID();
		str += "Account Name: " + getAccountName();
		str += String.format("Account Balance: $%.2f%n" + getBalance());		
		
		return str;	
	}
	
	
	
	
	
	
	
	
	
	
	
}//end class
