/*
Program: zackersfaculty.java          Last Date of this Revision: March 29, 2022
Purpose: zackersFaculty
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package universityofzackers;

public class zackersFaculty extends universityofZackers

{
		//initializing string used to store department, which is faculty specific 
		private String Deptname;
		
		public zackersFaculty(String Fn, String Ln, Integer Sal, String D)
		{
			super(Fn, Ln, Sal);
	 	
			Deptname = D;
			
		}
		
		//when the faculty class is called it will return the department name 
		public String toString()
		{
			return(super.toString() + " " + Deptname);
			
		}
		
	}

/* Screen Dump




 */