package com.looppr;

import java.util.*;
public class StrongNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		strongNo(n);
	}
	public static void strongNo(int n)
	{
		int r,sum=0;
		int temp=n;
		while(n!=0)
		{
			r=n%10;
			int fact=1;
			for(int i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Number is strong ");
		else
			System.out.println("Number is not strong ");
	}

}
