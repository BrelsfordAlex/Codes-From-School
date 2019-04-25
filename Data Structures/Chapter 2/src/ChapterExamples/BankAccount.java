package ChapterExamples;
/**
 * This is used to store and set methods for
 * a bank account
 * @author brelsforda382
 *
 */


public class BankAccount
{
	//Variables
private String name; 
private  double  balance;
private int accountID;
private double interestRate;
public static int numberOfAccounts = 0; 
/**
 * Default constructor
 * sets all values to default
 * 
 */
public BankAccount ()
{
balance = 0.00;
name = "No Name";
accountID = 0;
interestRate = 0.00;
numberOfAccounts++;
}
/**
 * Constructor that sets 2 variables called 
 * Balance and account ID
 * @param balance
 * @param accountID
 */
public BankAccount(double balance, int accountID)
{
deposit (balance); 
name = "No Name";
setAccountID(accountID);
interestRate = 0.00;
numberOfAccounts++;
}
/**
 * Constructor that sets a set of variables
 * @param balance
 * @param interestRate
 * @param accountID
 */
public BankAccount(double balance, double interestRate, int accountID)
{
deposit (balance); 
setInterestRate(interestRate);
setAccountID(accountID);
name = "No Name";
numberOfAccounts++;
} 
/**
 * Constructor setting variables
 * @param balance
 * @param interestRate
 * @param name
 * @param accountID
 */
public BankAccount(double balance, double interestRate, String name, int accountID)
{
deposit (balance);
setInterestRate(interestRate); 
setName(name);
setAccountID(accountID);
numberOfAccounts++;
}

/**
 * Gettor/Accesstor
 * used to get the name of a person
 * @return
 */
public String getName()
{
return name;
}

/**
 * Setter/mutator
 * used to set the name of a person
 * @return
 */
public void  setName(String name)
{
this.name  =  name;
}

/**
 * Gettor/Accesstor
 * used to get the name of a person
 * @return
 */
 public double getInterestRate()
{
return interestRate;
}
 /**
  * Gettor/Accesstor
  * used to get the name of a person
  * @return
  */
public void  setInterestRate(double interestRate)
{
this.interestRate  =  interestRate;
}
/**
 Setter/mutator
 * used to set the name of a person
 * @return
 */
public void setBalance(double balance) {
	this.balance = balance;
}
/**
 *Setter/mutator
 * used to set the name of a person
 * @return
 */
public double getBalance ()
{
return balance;
}
/**
 * Gettor/Accesstor
 * used to get the name of a person
 * @return
 */
public static int getNumberOfAccounts ()
{
return numberOfAccounts;
}

/**
 * This method is used to get the balance after a deposit od added
 * @return
 */
public double deposit (double amount)
{
	balance =balance + amount;
	/*
	 * The try and catch block 
	 * are to throws new exception
	 */
	try
	{
		
		if(amount <= 0)
		{
			throw new InvalidValueException("Invalid Deposit");
		}
		
	}
	
	catch(InvalidValueException e)
	{
		
		System.out.println("Invalid Deposit");
		
		
	}
	
	return balance;
} 
/**
 * This is used to calculate programs in the 
 * @return
 */
public  double  withdraw  (double amount)
{	
		balance = balance - amount;
		try
		{
			
			if(amount >= balance)
			{
				throw new InvalidWithdrawException("Invalid Withdrawl");
			}
			
		}
		
		catch(InvalidWithdrawException e)
		{
			
			System.out.println("Invalid Withdraw");
			
			
		}
		return balance;
}
/**
 * This adds an interst in the gifts
 * @return
 */
public void addInterest ()
{
double interest = balance *  interestRate;

balance = balance +  interest;
}

/**
 * this showas the balance
 * @return
 */
public static void showBalance (BankAccount account)
{
System.out.print (account.getBalance());

}
/**
 * Gettor/Accesstor
 * used to get the name of a person
 * @return
 */
public int getAccountID() 
{
	return accountID;
}
/**
 * Setter/mutator
 * used to set the name of a person
 * used to set the name of a person
 */
public void setAccountID(int accountID) 
{
	this.accountID = accountID;
}

public boolean equals(BankAccount other)
{
	/*
	 * what this does is compares balances and account id
	 */
	return ((this.balance == other.balance) && (this.accountID == other.accountID));
	
} // end 

public String toString()
{
	
	return("Name:"+this.name +"AccountID"+this.accountID +"Balance"+ this.balance +"Interest Rate"+this.interestRate);
	
}
}