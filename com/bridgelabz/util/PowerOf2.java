/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PowerOf2.java
 *  Execution:    java -cp bin com/bridgelabz/util/PowerOf2
 *  
 *  Purpose:   :take a command-line argument n and prints a table of
 the power of 2 that are less than or equal to 2^n.
 
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util; 


public class PowerOf2 {
 
   
public static void main(String[] args) {

 
      
	 // read in one command-line argument
 
       
	  int n = Integer.parseInt(args [0]);

  
                  
	  // count from 0 to N
      
	     int i = 0;

	    // the ith power of two

                   
	    int powerOfTwo = 1;  
      
	// repeat until i equals n
        
	while (i <= n) {
            
	System.out.println(i + " " + powerOfTwo);   
	// print out the power of two

            
	powerOfTwo = 2 * powerOfTwo;                
	// double to get the next one
            
	i = i + 1;
        
		}

 
	}

}
