package com.looppr;

import java.util.*;
public class SpyNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 int n=sc.nextInt();
		 
		 spyno(n);
	}
	public static void spyno(int n)
	{
		int r,sum=0,prod=1;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			prod=prod*r;
			n=n/10;
		}
		if(sum==prod)
			System.out.println("Number is spy");
		else
			System.out.println("Number is not spy");
	}

}
