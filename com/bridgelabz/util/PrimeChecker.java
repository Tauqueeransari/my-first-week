package com1.bridgelabz1.util1;


import java.lang.Long;
import java.lang.NumberFormatException;


public class PrimeChecker {

   
   public static String PRIME_NUMBER_MESSAGE = " is a prime number";

   
   public static String NOT_PRIME_NUMBER_MESSAGE = " is not a prime number";

  
   private long mInputNumber;

   
   private boolean mIsPrime;

   public PrimeChecker() {
      mInputNumber = 0; 
      this.checkPrime();
   }

   
   public PrimeChecker(long number) {
      mInputNumber = number; 
      this.checkPrime();
   }

   public void checkPrime() {
      mIsPrime = checkPrime(mInputNumber);
   }

   
   public String toString() {
      String message = "";
      // retrun string based on the mInputNumber is prime or not
      if (mIsPrime) message = mInputNumber + PRIME_NUMBER_MESSAGE;
      else message = mInputNumber + NOT_PRIME_NUMBER_MESSAGE;
      return message;
   }

   
   public static boolean checkPrime(long n) {
      boolean isPrime = true;

      // Any number less then 2 ia a prime
      if (n < 2) isPrime = false;

      // try all possible factors of n
      // if n has a factor, then it has one less than or equal to sqrt(n),
      // so for efficiency we only need to check factor <= sqrt(n) or
      // equivalently factor*factor <= n
      for (long factor = 2; factor*factor <= n; factor++) {
         // if factor divides evenly into n, n is not prime, so break out of loop
         if (n % factor == 0) {
             isPrime = false;
             break;
         }
      } // End of for loop
      return isPrime;
   }

   
   public static void main(String[] args) { 
      long n = 0;

      // Only taking valid integer input. If Exception is thrown than not procssing further.
      try {
        n = Long.parseLong(args[0]);
      } catch (NumberFormatException ex) {
        System.out.println("PLEASE ENTER VALID INPUT: "+ex.getMessage());
        return;
      }

      // Method 1 - using static function of Prime Checker
      // print out whether n is prime
      boolean isPrime = PrimeChecker.checkPrime(n);
      System.out.println("PRINTING RESULT USING PrimeChecker STATIC FUNCTION");
      if (isPrime) System.out.println(n + PrimeChecker.PRIME_NUMBER_MESSAGE);
      else System.out.println(n + PrimeChecker.NOT_PRIME_NUMBER_MESSAGE);

      // Method 2 - using instance function of Prime Checker
      PrimeChecker primeChecker = new PrimeChecker(n);
      System.out.println("PRINTING RESULT USING PrimeChecker INSTANCE FUNCTION");
      System.out.println(primeChecker.toString());
   }
}
