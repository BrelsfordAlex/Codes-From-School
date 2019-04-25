 
package ChapterExamples;
import java.util.Scanner;
/**
 * This is the demo class for the object class Bank accounjt
 * This will test all of the methods
 * @author brelsforda382
 *
 */
public class BankAccountDemo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Scanner
		Scanner scan = new Scanner(System.in);
		//Variables
		String name;
		double balance=0;
		double intrestRate=0;
		int AccountID;
		double x;
		double deposited;
		double takenout;
		
		//Constructors and setting variables
		

		//System.out.println(name); //used to see if the user imput works
		BankAccount account1 = new BankAccount();
		
		
		//Setting Account details
		
		System.out.println("AccountID:");
		AccountID = scan.nextInt();
		account1.setAccountID(AccountID);
	
	
		System.out.println("Would you like to:");
		System.out.println("1)Deposit                   2)Take out Money          ");
		System.out.println("3)Set Account Information   4)New Account      ");
		System.out.println("5)Compare Accounts          6)Get Bank Statement and End");
		x= scan.nextInt();
		
		if(x== 1)//Deposit
		{
			System.out.println("What would you like to deposit?");
			deposited = scan.nextDouble();
			balance = account1.deposit(deposited);
			System.out.println("Your new Balance:"+"$"+balance);
		}
		if(x== 2)//take out money
		{
			
			System.out.println("How Much would you like taken out from your balance of:" + balance);
			takenout = scan.nextDouble();
			balance = account1.withdraw(takenout);
			System.out.println("Your new Balance: "+"$"+balance);
			
		}
		if(x== 3)//set Account Information
		{
			
			System.out.println("What would you like to set?");
			System.out.println("Name or Balance?" + " Press 1 for name 2 for balance 3 to end this transaction");
			int answer = scan.nextInt();
			while (answer !=3)
			{
			    
			if(answer == 1)
			{
				System.out.println("Set your Name:");
				name = scan.next();
				account1.setName(name);
				
			}
			else if(answer == 2)
			{
			System.out.println("Balance");
			
			balance = scan.nextDouble();
			account1.setBalance(balance);
			}
			
			System.out.println("What would you like to set?");
			System.out.println("Name or Balance?" + " Press 1 for name 2 for balance 3 to end this transaction");
			answer = scan.nextInt();
			}

		}
		if(x== 4) //New Account
		{
			
		}
		if(x== 5)//compare
		{
			
		}
		if(x== 6)//bank statement and end
		{
			
		}
		
	}

}
