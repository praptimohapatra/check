package com.looppr;

import java.util.*;
public class ProductOfDg {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
   	    System.out.println("Enter a number: ");
   	    int n=sc.nextInt();
   	    int res=product(n);
   	    System.out.println(res);
	}
	public static int product(int n)
	{
		int rem,prod=1;
		while(n!=0)
		{
			rem=n%10;
			prod=prod*rem;
			n=n/10;
		}
		return prod;
	}

}
