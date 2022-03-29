/*
Program: universityofzackers.java          Last Date of this Revision: March 29, 2022
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
		//creating a new scanner to receive inputs 
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	
		//asking the set of questions on name, age, salary and faculty and assigning the answers to variables 
		System.out.println("Welcome to University of Zackers Employee Page, Please Enter the Following Details:");
		System.out.println("Enter Here, Employees First Name:");
		String Fn = input.next();
		
		System.out.println("Enter Here, Employees Last Name:");
		String Ln = input.next();
		
		System.out.println("Enter Here, Employees Salary:");
		int Sal = input.nextInt();
		
		System.out.println("Enter Here, Employee Type: Faculty or Staff:");
		//creates a string to store how the user responds to the question
		String EmpType;
		EmpType = input.next();
		
	   /* decision making statement depending on whether the previously entered string states that the employee is a faculty member, 
		  equalsIgnoreCase means the comparison to the inputed string ignores case considerations 				*/ 
		if(EmpType.equalsIgnoreCase("Faculty"))
		{
			System.out.println("Enter Here, Department Name:");
			//D string is set up so that it can input and display two word answers for department, Ex. (computer science)
			String D = input.next(); 
			       D+= input.nextLine(); 
			//return specific to faculty that displays all of the variables that have been inputed, including department
		    return new zackersFaculty(Fn, Ln, Sal, D);
			
		}
		
		else	
		{
			System.out.println("Enter Here, Job Title/Position:");
			//Job string has also been set up to take multiple word answers
			String Job = input.next();
			       Job+= input.nextLine();
			      	     
			//return specific to staff that displays all of the variables that have been inputed, including job title/position
			return new zackersStaff(Fn, Ln, Sal, Job);
			       
		}
	
	}	
		//adding main class and employees 
		public static void main(String[] args)
		{
			universityofZackers emp1;
			//creates variable for each of the three employees that will be inputed and displayed
			universityofZackers emp3;
			universityofZackers emp2;
	     /* assigns the traits from the public class UEmployee to each employee variable (emp1, emp2, emp3) so that
		    each employee being inputed gets its own set of questions asked and integers assigned to it 		*/	 
			emp1 = assign();
			emp2 = assign();
			emp3 = assign();	
			//after all three employees have had variables assigned to them the variables are displayed back to the user
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
1
Enter Here, Employee Type: Faculty or Staff:
Staff
Enter Here, Job Title/Position:
Janitor
 */