import java.util.Scanner;
public class Demo
{
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}

	public int multiply(int a,int b)
	{
		int c= a*b;
		return c;
	}

	public int substract(int a,int b)
	{	
		int c=0;
		if(a>b)
		{
			c=a-b;
		}
		return c;
	}

	public static void main(String [] args)
	{	
		 int x;int y;
		Demo demo=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
			x=sc.nextInt();
		System.out.println("Enter Second Number");
			y=sc.nextInt();
		System.out.println("Addition of two Number:"+demo.add(x,y));
			System.out.println("Multiplication of two Number:"+demo.multiply(x,y));
				System.out.println("Substraction of two Number:"+demo.substract(x,y));
	}

}
	
