/*
Program: hockeypuck.java          Last Date of this Revision: March 17, 2022
Purpose: Hockey Puck
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package pucks;

import java.text.NumberFormat;
import java.util.Scanner;

	public class hockeypuck
	{
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			
			reviewpuck pA = new reviewpuck(5.5);
			reviewpuck yt = new reviewpuck(4.0);

			//standard Review_Puck_Part_2_of_2

			System.out.println(pA.getWeight());
			System.out.println(pA.getDivision());
			System.out.println(pA.getRadius());
			
			//youth Review_Puck_Part_2_of_2

			System.out.println(yt.getWeight());
			System.out.println(yt.getDivision());
			System.out.println(yt.getRadius());

			String action;
			int w;
			double wArg;
			
			if(pA.equals(yt))
			{
				System.out.println("true");
				
			}
			else
			{
				System.out.println("false");
				
			}
		}
}

/* Screen Dump




 */