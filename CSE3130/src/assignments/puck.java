/*
Program: puck.java          Last Date of this Revision: March 17, 2022
Purpose: Circle Puck
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package assignments;

public class puck

	{
		   private static double PI = 3.141592;
		   private double radius;
		   
		   public puck()
		   {
		       radius = 1;//radius equals 1

		   }


		   public puck(double r)

		   {
		       radius = r;// radius equals r
		       
		   }
		   public void setRadius(double newRadius)
		   {
		       radius = newRadius;// get new radius   
		       
		   }
		   public double area()
		   {
		       double circleArea;
		       circleArea = PI * radius * radius;// PI times radius times radius

		       return(circleArea);
		       
		   }
		   public double getRadius()
		   {
		       return(radius);
		       
		   }
		   public double circumference()
		   {
		       double circleCircumference;
		       circleCircumference = 2 * PI * radius;// two times PI times radius
		       return(circleCircumference);
		       
		   }
		   public static void displayAreaFormula()
		   {
		   	
		       System.out.println("Area For A Circle Is: A= (PI)(r)^2");
		       
		   }
		   public boolean equals(Object c)
		    {
			   puck testObj = (puck)c;
		       if (testObj.getRadius() == radius)
		       {
		           return(true);
		           
		       }
		       else
		       { 
		           return (false);
		           
		       }
		    }
		    public String toString()
		    {
		        String circleString;
		        circleString = "The Circle has a Radius of " + radius;
		        
		        return(circleString);
		        
		    }
	}

/* Screen Dump
 
 */