

package com.bridgelabz.lib;


class MathFunction{

    public static  double harmonic(int n){

        double sum = 0;
	for(int i=1;i <=n;i++) {
            sum= sum + (1/i) ;         
        }
        return sum;
    }

    public static double Sin(int number){
        double radians = Math.toRadians(number);
        double mSin = Math.sin(radians);
        return mSin;
    }

    public static double Cos(int number){
        double radians = Math.toRadians(number);
        double mCos = Math.cos(radians);
        return mCos;
    }

    public static String binaryNumber(int n) {
        int Num = n;

        String binary = "";

        int mReminder;

        while(Num > 0) {
            mReminder = Num % 2;
            Num = Num / 2;
            binary+=mReminder;
        }
        return binary;
    }

    public static double Sqrt(double c){
        double c=number;

        double epsilon = 1e-15;  
        double t = c;    
        while (Math.abs(t - c/t) > epsilon*t) {
  
          t = (c/t + t) / 2.0;
     
   	}

 
        return t;
    }

    public static double Sqrt(double c,double epsilon){
        double c = number;
	double epsilon =1e-15;
        double t = c;
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        return t;
    }

    public static boolean isPrime(int number) {
        boolean isPrimeNumber = false;
        int flag = 0;
        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    flag++;
                }
            }
            if (flag == 2) {
                isPrimeNumber = true;
                return isPrimeNumber;
            }
            else
                return isPrimeNumber;
    }
}

    public static long factorial(int number){
        long mNumber = 1;
        while(number >= 1){
            mNumber = mNumber * number;
            number--;
        }
        return mNumber;
    }

    public static double futureValue(double doller, double rate, double period){

        double FutureValue = doller * (Math.pow((1 + rate), period));

        return FutureValue;
    }

    public static double presentValue(double doller, double rate, double period){
        double PresentValue = doller / (Math.pow((1 + rate), period));

        return PresentValue;
    }

    public static int maxValue(int[] num) {

        int m = args[0];

        for (int i = 1; i < args.length; i++) {
            if (num[i] > m) {
                m = num[i];
            }
        }

        return m;
    }

    public static int minValue(int[] numbers) {

        int mSmallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < mSmallest) {
                mSmallest = numbers[i];
            }
        }
        return mSmallest;
    }

    public static int minValue(String s[]) {

        int[] numbers = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            numbers[i] = Integer.parseInt(s[i]);

        }

        int mSmallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < mSmallest) {
                mSmallest = numbers[i];
            }
        }
        return mSmallest;
    }

    public static int maxValue(String mNumbers[]) {

        int[] numbers = new int[mNumbers.length];

        for (int i = 0; i < mNumbers.length; i++) {
            numbers[i] = Integer.parseInt(mNumbers[i]);
        }
        int mLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > mLargest) {
                mLargest = numbers[i];
            }
        }
        return mLargest;
    }

    public static boolean checkCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slopeAB = (y2 - y1) / (x2 - x1);
        int slopeBC = (y3 - y2) / (x3 - x2);
        int slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAC == slopeAB && slopeAB == slopeBC;
    }

    public static boolean checkCollinearUsingTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        boolean isCollinear = false;
        int a = x1 - x2;
        int b = x2 - x3;
        int c = y1 - y2;
        int d = y2 - y3;

        int area = (a * d) - (b * c);

        area = 1/2 * area;

        if(area == 0)
            isCollinear = true;

        return isCollinear;
    }

    public static void main(String args[]){
	System.out.println(Integer.parseInt(args [0]));
    }
}
}
}
