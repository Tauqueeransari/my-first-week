import java.util.Scanner;
public class Swap 
{
  public static void swapMethod(int a, int b)
   {
	  System.out.println("before swapping : a="+a+ "and b="+b);
      int c=a;
      a = b;
      b = c;
      System.out.println("after swapping: a="+a+ "and b="+b);
   }

   public static void main(String[] args) 
    {
 		Swap swap=new Swap();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        int n1=sc.nextInt();
        System.out.println("enter the second number");
         int n2=sc.nextInt();
        swap.swapMethod(n1,n2);
    }	   
	    
}
