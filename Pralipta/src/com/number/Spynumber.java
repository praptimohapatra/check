package com.number;

import java.util.*;
public class Spynumber {
	  public static void main(String[] args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a number:");
		  int n=sc.nextInt();
		  
		  int sum=0,product=1,r;
		  while(n!=0)
		  {
			  r=n%10;
			  sum=sum+r;
			  product=product*r;
			  n=n/10;
		  }
		  if(sum==product)
		  {
			  System.out.println("Number is spy number ");
		  }
		  else
		  {
			  System.out.println("Number is not a spy number ");
		  }
	  }
        
}
