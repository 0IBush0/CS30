/*
Program: bankofZackers.java          Last Date of this Revision: April 5, 2022
Purpose: Zackers Bank
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package businessofzackers;

import java.util.Scanner;

public class bankofZackers
{
		public static zackersCustomer assign() 
		{
		try (Scanner input = new Scanner(System.in))
			{
				System.out.println("Welcome to Bank Of Gordon's Account Manager");
				
				System.out.println("Please Enter your First Name: ");
				String Fn = input.next();
				
				System.out.println("Please Enter Your Last Name: ");
				String Ln = input.next();
			
				System.out.println("\nPlease Enter the Following Account Information");
				
				System.out.println("Enter City: ");
				String C = input.next();
				
				System.out.println("Enter State/Province: ");
				String S = input.next();
				
				System.out.println("Enter Street Address (In The Form: ### Address Cordin.): ");
				String s = input.next();
				s+= input.nextLine();
			       
				System.out.println("Enter Postal Code (In The Form A#A#A#");
				String P = input.next();

				System.out.print("\nYour Finalized Account Details are Listed Below:");
				return new zackersCustomer(Fn, Ln, C, S , s, P);
				
			}
		
		}
		public static void main(String[] args) 	
		{
			zackersCustomer cust;		
			cust = assign();
			System.out.println(cust);	

		}
		
}

/* Screen Dump




 */