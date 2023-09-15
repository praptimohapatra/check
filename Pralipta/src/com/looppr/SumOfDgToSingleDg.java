package com.looppr;

import java.util.*;
public class SumOfDgToSingleDg {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		singleDgSum(n);
	}
	public static void singleDgSum(int n)
	{
		int r=0;
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
				r=n%10;
				sum=sum+r;
				n=n/10;
			}
			n=sum;
		}
		System.out.println("Single digit sum:"+n);
	}

}
