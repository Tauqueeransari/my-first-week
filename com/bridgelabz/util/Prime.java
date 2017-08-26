/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Prime.java
 *  Execution:    java -cp bin com/bridgelabz/util/Prime
 *  
 *  Purpose:  program that takes a range of number as input and outputs the Prime number
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util; 


import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
    {
         int s1, s2,flag = 0, i, j;
         Scanner s = new Scanner(System.in);
         System.out.println ("Enter the lower limit :"); 
         s1 = s.nextInt();
         System.out.println ("Enter the upper limit :"); 
         s2 = s.nextInt();
         System.out.println ("The prime numbers in between the entered limits are :");
         for(i = s1; i <= s2; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
    }
}