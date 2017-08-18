/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Trig.java
 *  Execution:    java -cp bin com/bridgelabz/util/Trig
 *  
 *  Purpose:   llustrate   various   trigonometric   functions.
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;


public class Trig { 

   public static void main(String args[]) { 

        //Takes Input from user at Command Line arguments        
        double degrees = Double.parseDouble(args[0]);
	double radians = Math.toRadians(degrees);
	
	double s = Math.sin(radians);
	System.out.println("sin("+ degrees  +") = " + s);

	double c = Math.cos(radians);
	System.out.println("cos("+ degrees +") = " + c);

	double t = Math.tan(radians);
	System.out.println("tan("+ degrees +") = " + t);
	System.out.println(s + "/" + c + " = " + s / c);
	
	double r = s*s + c*c;
	System.out.println(s*s + " + "+ c*c + " = " + r);
	
   }
}
