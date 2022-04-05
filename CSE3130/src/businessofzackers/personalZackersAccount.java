/*
Program: personalZackersAccount.java          Last Date of this Revision: April 5, 2022
Purpose: Personal Account
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package businessofzackers;


public class personalZackersAccount extends zackersAccount
{
	public personalZackersAccount(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{		
	      super(bal, fName, lName, str, city, st, zip);
		
	      if (bal < 100)
	      {
	    	  bal = bal - 2;
		
	    	  System.out.println("A Personal Account Requires at Least $100, a $2.00 fee has been charged for not meeting the requirements");
	    	  toString();
	    	  
	      }
	}
}

/* Screen Dump




 */