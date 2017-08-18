/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/FlipCoin.java
 *  Execution:    java -cp bin com/bridgelabz/util/FlipCoin
 *  
 *  Purpose:   flip the coin and print head and tail
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util; 


import java.util.Scanner;
 
public class FlipCoin {
    public static void main(String [] args)
      {
       
        double flip;
        int count = 0;
        int countHeads = 0;
        int countTails = 0;
        int percentHeads = 0;
        int percentTails = 0;
                  
        for(int x = 0; x <= 5;x = x++)
        {
            x = x + 1;
	
	  // Math.random() returns a value between 0.0 and 1.0

           flip = Math.random();
           
           if( flip <= 0.5)
            {   
                flip = countHeads;
                countHeads = countHeads + 1;
                percentHeads = countHeads * 10;
                }
            else
            {           
                flip = countTails;
              countTails = countTails + 1;
                percentTails = countTails * 10;
                System.out.println("Heads was flipped " +percentHeads + " percent of the time.");
                System.out.println("Tails was flipped " +percentTails + " percent of the time.");
            
            }
            
            count = count +1;
                                                
        }
                  
}
}
