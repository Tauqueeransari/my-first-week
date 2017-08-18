/******************************************************************************
 *  Compilation:  javac -d bin IntOpt.java
 *  Execution:    java -cp bin com.bridgelabz.util.IntOpt 
 *  
 *  Purpose: Get input values and do Some Integer operations.
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util; 


import java.util.Scanner;

class IntOpt {
	
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		
		// declaration of a,b,c to take input from user
		int a, b, c;
		
		//Taking Input From User

		System.out.print("Enter values of a:");
		a=sc.nextInt();
		System.out.print("Enter values of b:");
		b=sc.nextInt();
		System.out.print("Enter values of c:");
		c=sc.nextInt();
		
		//Prints The output  

		System.out.println("a + b * c = " +( a + b * c ));
		System.out.println("a * b + c = " +( a * b + c ));
		System.out.println("c + a / b = " +( c + a / b ));
		System.out.println("a % b + c = " +( a % b + c ));
	}
}
