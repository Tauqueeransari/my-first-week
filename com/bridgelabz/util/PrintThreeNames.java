/******************************************************************************
 *  Compilation:  javac -d bin PrintThreeNames.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrintThreeNames 
 *  
 *  Purpose: print three name in reverse order.
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util; 


public class PrintThreeNames {

   public static void main(String[] args) {
  // taking three command line argument
	String a=args[0];
	String b=args[1];
	String c=args[2];
	
   System.out.println("Hi "+args[2]+" "+args[1]+" "+args[0]+" ");
	}
}
