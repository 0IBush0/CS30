/*
Program: zackersAccount.java          Last Date of this Revision: April 5, 2022
Purpose: Account
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package businessofzackers;

import java.text.NumberFormat;

public class zackersAccount
{
	private double balance;
	private zackersCustomer cust;

	public zackersAccount(double bal, String fName, String lName, String stre, String city, String st, String zip)
	{
		balance = bal;
		cust = new zackersCustomer(fName, lName, stre, city, st, zip);

	}
	
	public double getBalance()
	{
	 	return(balance);

	}

	public void deposit(double amt)
	{
	 	balance += amt;

	}

	public void withdrawal(double amt)
	{
	 	if (amt <= balance)
	 	{
	 		balance -= amt;

	 	}
	 	else
	 	{
	 		System.out.println("There's not enough money in account.");

	 	}

	}

	public String toString()
	{
		String accountString;
		
		NumberFormat money = NumberFormat.getCurrencyInstance();

		accountString = cust.toString();
		accountString += "Your Current balance is " + money.format(balance);
		//return the balance value
	 	return(accountString);
	 	
	}

}

/* Screen Dump




 */