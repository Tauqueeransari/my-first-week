public class Multiply
{
	 public int mul(int a,int b,int c)
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		int d=a*b*c;
		return d;
	}
		
public static void main(String args[])
		{
			Multiply obj=new Multiply();
			int a=Integer.parseInt(args [0]);
			int b=Integer.parseInt(args [1]);
			int c=Integer.parseInt(args [2]);
			obj.mul(a,b,c);
			System.out.println( "the value is"+a*b*c);
		}
}


			
		
	

