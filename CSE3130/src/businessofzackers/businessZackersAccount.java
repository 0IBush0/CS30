/*
Program: businessZackersAccount.java          Last Date of this Revision: April 5, 2022
Purpose: Business Account
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package businessofzackers;


public class businessZackersAccount extends zackersAccount
{
	public businessZackersAccount(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{
	      super(bal, fName, lName, str, city, st, zip);
	
	      if (bal < 500) 
	      {
	    	  bal = bal - 10;
	    	  System.out.println("A busines account requires a minimum balance of $500, a $10.0 fee has been charged for not meeting the requirements");
	    	  toString();
		
	      }
	}
}

/* Screen Dump




 */