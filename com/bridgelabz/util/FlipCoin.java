/***************************************************************************
* Purpose : flip the coin and print heads and tails
*
*@author : Tauqueer ansari
*@version : 1.0
*@since : 10-08-2017
****************************************************************************/

public class FlipCoin {
  public static void main(String args[]) {

  // Math.random() returns a value between 0.0 and 1.0

  if(Math.random()<0.5)
System.out.println("Heads");
else
  System.out.println("Tails");
}
}