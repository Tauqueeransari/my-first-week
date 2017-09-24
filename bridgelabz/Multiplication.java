public class Multiplication
{
  public int mul(int a,int b,int c)
  {
	int d=a*b*c;
	return d;
  }

public static void main(String args[])
{
	Multiplication m=new Multiplication();
	int a=Integer.parseInt(args [0]);
	int b=Integer.parseInt(args [1]);
	int c=Integer.parseInt(args [2]);
	System.out.println("the ans is " +m.mul(a,b,c));
	}
}
