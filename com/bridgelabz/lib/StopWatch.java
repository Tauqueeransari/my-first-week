import java.util.Scanner;    
public class StopWatch 
{
    private static long start;
    public StopWatch() 
	{
        start = System.currentTimeMillis();
    }

    public static long elapsedTime()
	{
        long now = System.currentTimeMillis();
        return (now - start);
    }	  
  	public static void main(String[] args) {
 	 Scanner sc=new Scanner(System.in);
  		if(sc.hasNext())
		System.out.println(StopWatch.elapsedTime());

	}
}
