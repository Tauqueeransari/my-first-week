/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/WindChill.java
 *  Execution:    java -cp bin com/bridgelabz/util/WindChill
 *  
 *  Purpose:   calculate the windchill.
 *
 *  @author  Tauqueer ansari
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.util; 


class WindChill {

   public static void main(String args[]) {
	
	//Takes two double  COMMAND LINE ARGUMENT
	double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        t = Math.abs(t);

       //CALCULATE WIND CHILL 
       
        v= Math.pow(v,0.16);
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * v;
        System.out.println("Wind Chill is "+w);      
	}
}
