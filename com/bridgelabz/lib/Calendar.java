/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/lib/Calendar.java
 *  Execution:    java -cp bin com/bridgelabz/lib/Calendar
 *  
 *  Purpose: Static Function to find Day Of Week that date falls on.
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   17-08-2017
 *
 ******************************************************************************/
         


package com.bridgelabz.lib;

class Calendar {

	//Static function that calculate the date 

	static int dayOfWeek(int Day,int Month, int Year){

        //Calculate the date 
        int y = Year - (14 - Month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = Month + 12 * x * ((14 - Month) / 12) - 2;
        int d = (Day + x + 31 * m / 12) % 7;

        //returns the date
        return d;	
	}

	public static String DisplayDay(int index) {
	String[] Day={"Sun","Mon","Tues","Wed","Thurs","Fri","Sat"};
	return Day[index];
	}

	public static void main(String args[]){

        //prints and call the static fucntion
	System.out.println(dayOfWeek(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2])));
    }
}
