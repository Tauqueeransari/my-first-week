/***************************************************************************
* Purpose : print the windchill
*
* @author : Tauqueer ansari
* @version : 1.0
* @since : 09-08-2017
****************************************************************************/


class WindChill {

   public static void main(String args[]) {

      //Takes two double  COMMAND LINE ARGUMENT
      double t = Double.parseDouble(args[0]);
      double v = Double.parseDouble(args[1]);
      t = Math.abs(t);

      //CALCULATE WIND CHILL IF TEMP IS LESS AND SPEED IS GREATER THAN 120
      if(t <= 50 && (v > 120 || 3 > v)) {
         v= Math.pow(v,0.16);
         double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * v;
         System.out.println("Wind Chill is "+w);
      }
      else 
         System.out.println("Tempreture(F) is larger that 50  otherwies Speed greater than 3 and smaller than 120 ..");
   }
}
