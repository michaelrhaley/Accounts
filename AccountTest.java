import java.util.*;
import java.util.Formatter.*;



public class AccountTest extends Account
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		CheckingAccount chkAct = new CheckingAccount();
		SavingsAccount savAct = new SavingsAccount();
		Account[] act = new Account[2];
		
		act[0] = chkAct;
		act[1] = savAct;
		chkAct.setAccountID(1234);
		savAct.setAccountID(5564);
		
		//create accounts
		System.out.println("Creating a checking account, enter name: ");
		chkAct.accountName = input.nextLine();
		System.out.println("Your checking account number is: " + chkAct.getAccountID());
		System.out.println("Creating a savings account, enter name: ");
		savAct.accountName = input.nextLine();
		System.out.println("Your savings account number is: " + savAct.getAccountID());
		//checking account
		System.out.println("Processing account number " + chkAct.getAccountID());
		System .out.println("Make initial deposit ");
		chkAct.processDeposit(Double.parseDouble(input.nextLine()));
		System .out.printf("Your balance is $%.2f%n", chkAct.getBalance());
		System .out.println("Make a withdrawal ");
		chkAct.processWithdrawal(Double.parseDouble(input.nextLine()));
		System .out.printf("Your balance is $%.2f%n", chkAct.getBalance());
		System .out.println("Make a withdrawal ");
		chkAct.processWithdrawal(Double.parseDouble(input.nextLine()));
		//System .out.printf("Your balance is $%.2f%n", chkAct.getBalance());
		chkAct.displayAccount();
		//savings account
		System.out.println("Processing account number " + savAct.getAccountID());
		System .out.println("Make initial deposit ");
		savAct.processDeposit(Double.parseDouble(input.nextLine()));
		System .out.printf("Your balance is $%.2f%n", savAct.getBalance());
		System .out.println("Make a withdrawal ");
		savAct.processWithdrawal(Double.parseDouble(input.nextLine()));
		System .out.printf("Your balance is $%.2f%n", savAct.getBalance());
		System .out.println("Make a withdrawal ");
		savAct.processWithdrawal(Double.parseDouble(input.nextLine()));
		//System .out.printf("Your balance is $%.2f%n", savAct.getBalance());
		savAct.displayAccount();


		
		
//		for(Account currentAccount : act)
//		{
//			System.out.println("Creating a checking account, enter name: ");
//			chkAct.accountName = input.nextLine();
//			System.out.println("Your checking account number is: " + chkAct.getAccountID());
//			System.out.println("Creating a savings account, enter name: ");
//			savAct.accountName = input.nextLine();
//			System.out.println("Your savings account number is: " + savAct.getAccountID());
//			System.out.println("Processing account number " + chkAct.getAccountID());
//			System .out.println("Make initial deposit ");
//			chkAct.processDeposit(Double.parseDouble(input.nextLine()));
//			
//			
//		}


		
		
//		CheckingAccount chk = new CheckingAccount();
//		SavingsAccount sav = new SavingsAccount();
//		chk.setAccountName("John Snow");
//		chk.setAccountID(55595);
//		chk.getBalance();
//		System.out.println("Name: " + chk.getAccountName());
//		System.out.println("ID: " + chk.getAccountID());
//		System.out.println("Balance: " + chk.getBalance());
//		chk.processDeposit(50);
//		System.out.println("Balance: " + chk.getBalance());
//		chk.processWithdrawal(80);
//		System.out.println("Balance: " + chk.getBalance());
//		
//		chk.displayAccount();

		
		
//		sav.setAccountName("John Snow");
//		sav.setAccountID(100233);
//		sav.getBalance();
//		
//		System.out.println("Balance: " + sav.getBalance());
//		sav.processDeposit(2500);
//		System.out.println("Balance: " + sav.getBalance());
//		sav.processWithdrawal(500);
//		System.out.println("Balance: " + sav.getBalance());
//		
//		sav.displayAccount();

		
		
//		double depositAmount;
//		double withdrawalAmount;
//		System.out.println("Bank Account Program");
//		System.out.println("---------------------------------------------------");
//		act.setAccountName("John Snow");
//		System.out.println("Hey, " + act.accountName);
//		System.out.println("Account number " + act.accountID + " has a balance of:  $" + act.balance);
//		System.out.print("Enter the deposit amount ");
//		depositAmount = Double.parseDouble(input.nextLine());
//		System.out.println("New balance is $" + act.balance);
		
		
		
		
		
		
		
		
	}

}
