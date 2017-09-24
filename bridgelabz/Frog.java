
public class Frog
{	
	int count=0,distance=0; 
	public int calculate(int height,int jump,int slip)
	{
	 	while(distance<=height)
	{
		distance=distance+jump;
		distance=distance-slip;
		count++;
	}
		return count;
}

public static void main(String[] args)
	{
	Frog f=new Frog();
	int height=Integer.parseInt(args [0]);
	int jump=Integer.parseInt(args [1]);
	int slip=Integer.parseInt(args [2]);
	System.out.println("the value is " +f.calculate(height,jump,slip));
	}
}
 
