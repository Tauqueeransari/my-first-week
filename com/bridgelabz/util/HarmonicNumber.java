/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/HarmonicNumber.java
 *  Execution:    java -cp bin com/bridgelabz/util/HarmonicNumber
 *  
 *  Purpose:   : take a command-line argument and prints n harmonic number 
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util; 


public class HarmonicNumber { 
    
     public static void main(String[] args) {
 

        
   	// command-line argument
        
      	int n = Integer.parseInt(args[0]);


        
	// compute 1/1 + 1/2 + 1/3 + ... + 1/n
  
      
	  double sum = 0.0;
        
	  for (int i = 1; i <= n; i++) 
	  {
            
	  sum =sum + 1.0 / i;
           
	  }

        
	// print the nth harmonic number
        
	System.out.println(sum);
    
	}


}
