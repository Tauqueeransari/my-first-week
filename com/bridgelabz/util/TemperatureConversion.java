/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/TemperatureConversion.java
 *  Execution:    java -cp bin com/bridgelabz/util/TemperatureConversion
 *  
 *  Purpose: Convert Tempreture from Celsius To Fahrenheit.
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util;


import java.util.Scanner;

public class TemperatureConversion {

   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);

      //Takes Temprature as input in runtime
      double C,F;
      System.out.println("Enter The Temprature in Celsius : ");
      C = sc.nextDouble();

      F = (C * 9/5) + 32;
      System.out.println("Temprature in Fahrenheit is "+F);
      
     System.out.println("Enter The Temprature in Fahrenheit : ");
      F = sc.nextDouble();

      C = (F - 32) * 5/9;
      System.out.println("Temprature in Celsius is "+C);
      
   }
}
