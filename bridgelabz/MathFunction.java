class MathFunction{

    public static  double harmonic(int n){

        double sum = 0.0;
	for(int i=1;i <=n;i++);
            sum += 1.0/i ;         
        return sum;
   }
	    public static void main(String args[]){
	System.out.println(Integer.parseInt(args [0]));
    }
}
