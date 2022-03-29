/*
Program: zackersemployee.java          Last Date of this Revision: March 29, 2022
Purpose: zackersEmployee
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package universityofzackers;

public class zackersEmployee

{
	private String firstName, lastName;
	private Integer Salary; 
	
	//creating the basic information for an employee that will be later inherited by the staff and faculty classes)
	public zackersEmployee(String Fn, String Ln, Integer Sal)
	{
		firstName = Fn;
		lastName = Ln;
		Salary = Sal;
		
	}
	
	//returns a string representation of the object that contains the basic information for an employee 
	public String toString()
	{
		return (firstName + " " + lastName + " $" + Salary);
	
    }
	
}

/* Screen Dump




 */