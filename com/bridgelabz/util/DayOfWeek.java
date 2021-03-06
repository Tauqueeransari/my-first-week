/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/DayOfWeek.java
 *  Execution:    java -cp bin com/bridgelabz/util/DayOfWeek
 *  
 *  Purpose: print Day of the week that date falls on.
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util; 


class DayOfWeek {

   public static void main(String args[]) {

         //Takes input from user as command Line argument

         int mDay = Integer.parseInt(args[0]);
	 int mMonth = Integer.parseInt(args[1]);
         int mYear = Integer.parseInt(args[2]);

         //Calculate the date fall on  
         int y = mYear - (14 - mMonth) / 12;
         int x = y + y / 4 - y / 100 + y / 400;
         int m = mMonth + 12 * x * ((14 - mMonth) / 12) - 2;
         int d = (mDay + x + 31 * m / 12) % 7;
				
	 System.out.println(+d);
   } 
}
            

