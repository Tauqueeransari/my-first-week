/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/CarLoan.java
 *  Execution:    java -cp bin com/bridgelabz/util/CarLoan
 *  
 *  Purpose:   calculates the monthly payments of a car loan.
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;


class CarLoan {

   public static void main(String args[]) {

      //Takes input from user at command Line arguments

      double P= Double.parseDouble(args[0]);
      int Y = Integer.parseInt(args[1]);
      double R = Double.parseDouble(args[2]);

      //Calculates Payment need to be completed per Month
      int n = 12 * Y;
      double r = R / (12 * 100);
      double a = Math.pow((1 + r),(-n));
      double payment = (P * r)/(1 - a);

      System.out.println("The monthly Payment is "+ payment);
   }
}
