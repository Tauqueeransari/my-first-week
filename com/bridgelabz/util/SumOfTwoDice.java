/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SumOfTwoDice.java
 *  Execution:    java -cp bin com/bridgelabz/util/SumOfTwoDice
 *  
 *  Purpose: Generate 2 random no  between 1 & 6 and print their sum 
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util; 

public class SumOfTwoDice {
    public static void main(String args[]) {
     int a=1 + (int) (Math.random() * 6);
     int b=1 + (int) (Math.random() * 6);
     int sum= a + b;
     System.out.println(sum);
}
}