package com.looppr;

import java.util.*;
public class SumOfDigits {
          public static void main(String[] args)
          {
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("Enter a number: ");
        	 int n=sc.nextInt();
        	 int res=sumDg(n);
        	 System.out.println(res);
          }
          public static int sumDg(int n)
          {
        	  int rem,sum=0;
        	  while(n!=0)
        	  {
        		  rem=n%10;
        		  sum=sum+rem;
        		  n=n/10;
        		  
        	  }
        	  return sum;
          }
}
