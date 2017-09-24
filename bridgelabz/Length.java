import java.util.Scanner;
public class Length
{
	public int lengthOfString(String s1)
    {
		int length=s1.length();
		return length;
    }
      public static void main(String[] args)
        {
	      Length length=new Length();
		  Scanner scanner=new Scanner(System.in);
          System.out.println("enter the string");
          String s=scanner.next();
          length.lengthOfString(s);
          int l= length.lengthOfString(s);
          System.out.println(l);        
         }
          
}
