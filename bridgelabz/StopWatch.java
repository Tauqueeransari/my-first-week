     
public class StopWatch {

    private static long start;

    public StopWatch() {
        start = System.currentTimeMillis();
    }

    public static long elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start);
    }	  
  public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
	}
}
