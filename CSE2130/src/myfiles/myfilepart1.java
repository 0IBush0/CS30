/*
Program: myfilepart1.java          Last Date of this Revision: April 11, 2022
Purpose: My File P1
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package myfiles;

import java.io.*;

public class myfilepart1
{
	public static void main(String[] args)
	{
		File textFile = new File("c:\\temp\\supplies.txt");
		if (textFile.exists())
		{
			System.out.println("File already exists.");
		}
		else
		{
			System.out.println("File does not exist.");
		}
		
	}
	
}

/* Screen Dump




 */