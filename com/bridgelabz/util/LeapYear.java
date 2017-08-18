/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/LeapYear.java
 *  Execution:    java -cp bin com/bridgelabz/util/LeapYear
 *  
 *  Purpose: print leap year or not a leap year.
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util; 

import java.util.Scanner;

class LeapYear {
	
	public static void main(String args[]) { 

		Scanner sc = new Scanner(System.in);
		
		//take input from user 
		int Year;

		//gives true or false
		boolean mIsLeap = false ; 
		
		//getting input from user
		System.out.print("Enter Year : ");
		Year = sc.nextInt();
		
		//find leap or not	
		if( Year >= 1582 ) {
			mIsLeap = ( Year % 4 ) == 0;
			mIsLeap = mIsLeap && ( Year % 100 ) != 0;
			mIsLeap = mIsLeap || ( Year % 400 ) == 0;
		
		if( mIsLeap == true )
			System.out.println("Leap Year");
		else 
			System.out.println("Not a Leap Year");
		}
		
	}
}
