/*
Program: universityofzackers.java          Last Date of this Revision: March 30, 2022
Purpose: universityofZackers
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/


package universityofzackers;

import java.util.Scanner;

public class universityofZackers

{

public static universityofZackers assign() 
		{
		Scanner input = new Scanner(System.in);
	
		//asking the set of questions for the variables
		System.out.println("Welcome to University of Zackers Employee Page!:");
		System.out.println("Please enter Employees First Name:");
		String Fn = input.next();
		
		System.out.println("Please enter Employees Last Name::");
		String Ln = input.next();
		
		System.out.println("Please enter Employees Salary:");
		int Sal = input.nextInt();
		
		System.out.println("Please enter Employee Type: Faculty or Staff:");
		//creates a string to store answer
		String EmpType;
		EmpType = input.next();
		
		if(EmpType.equalsIgnoreCase("Faculty"))
		{
			System.out.println("Enter Here, Department Name:");//print out enter department name
			String D = input.next(); 
			       D+= input.nextLine(); 
			//return specific to faculty that displays all of the input variables
		    return new zackersFaculty(Fn, Ln, Sal, D);
			
		}
		else	
		{
			System.out.println("Enter Here, Job Title/Position:");
			//May use multiple word answers
			String Job = input.next();
			       Job+= input.nextLine();
			
			//return specific to staff that displays all of the variables that have been inputed
			return new zackersStaff(Fn, Ln, Sal, Job);
			
		}
	
		}	
		//adding main class and employees 
		public static void main(String[] args)
		{
			//creates variable for each employees that are inputed, then display it
			universityofZackers emp1;
			universityofZackers emp2;
			universityofZackers emp3;
			
			emp1 = assign();
			emp2 = assign();
			emp3 = assign();
			//after all three employees have had variables assigned to them, display all variables
			System.out.println("\nThree University Employees:");
			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp3);
		
		}	
	
}

/* Screen Dump
Welcome to University of Zackers Employee Page, Please Enter the Following Details:
Enter Here, Employees First Name:
Zac
Enter Here, Employees Last Name:
Qiu
Enter Here, Employees Salary:
20
Enter Here, Employee Type: Faculty or Staff:
Faculty
Enter Here, Department Name:
Zackers Department
 */