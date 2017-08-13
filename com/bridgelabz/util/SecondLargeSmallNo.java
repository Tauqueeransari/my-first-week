 //package com.bridgelabz.util;

import java.util.Scanner;
class SecondLargeSmallNo
{
  public static void main(String[] args)
   {
    int n,temp,i,j;
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the no of element:");
    n=s.nextInt();
    int a[]=new int[n];
    //for entering the element
    System.out.println("Enter these element:");
    for( i=0;i<n;i++)
    {
     a[i]=s.nextInt();
    }

    //for finding largest & smallest no.
    for(i=0;i<n;i++)
    {
      for( j=i+1; j<n;j++)
       {
         //for smallest no.
         if(a[i] > a[j])
          {
           temp=a[i];
           a[i]=a[j];
	   a[j]=temp;
           }
        }
      }
 System.out.println("2nd largest:" +a[n-2]);
 System.out.println("smallest :"+a[1]);
}
}
