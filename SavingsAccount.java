import java.util.*;
import java.util.Formatter.*;


public class SavingsAccount extends Account
{
	@Override
	public double processWithdrawal(double withdrawalAmount)
	{
		if((balance - withdrawalAmount) < 0)
		{
			System.out.println("Insufficient funds!");
			return balance;
		}
		else
		{
			balance = balance - withdrawalAmount;
		}
		return balance;
	}
	
	public double calcInterest(double balance)
	{
		if(balance >= 5000)
		{
			balance = balance * 1.04;
			return balance * .04;
		}
		else if(balance >= 3000)
		{
			balance = balance * 1.03;
			return balance * .03;
		}
		else
		{
			balance = balance * 1.02;
			return balance * .02;
		}
		//return earned;
		
	}
	
	public String displayAccount()
	{
		String str;
		str = "Account Type: Savings";
		str += "Account #: " + getAccountID();
		str += "Account Name: " + getAccountName();
		str += "Interest Earned: $%.2f%n" + calcInterest(balance);
		str += "Account Balance: $%.2f%n" + getBalance();		
		
		return str;
	}
}
