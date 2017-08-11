/***************************************************************************
* Purpose : Get input and Do Some operations using Double Values


*@ author : Tauqueer ansari
*@ version : 1.0
*@ since : 08-08-2017
****************************************************************************/


import java.util.Scanner;

class DoubleOpt {
	
	public static void main(String args[]) { 

		Scanner sc = new Scanner(System.in);
		
		//a,b,c is decleared To take input from user
		double A, B, C;
		
		//Taking Input From User

		System.out.print("Enter values A:");
		A=sc.nextDouble();
		System.out.print("Enter values B:");
		B=sc.nextDouble();
		System.out.print("Enter values C:");
		C=sc.nextDouble();
		

		//Prints The output  

		System.out.println("a + b * c = "+( A + B * C ));
		System.out.println("a * b + c = "+( A * B + C ));
		System.out.println("c + a / b = "+( C + A / B ));
		System.out.println("a % b + c = "+( A % B + C ));
	}
}
