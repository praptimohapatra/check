package com.looppr;

import java.util.*;
public class ArmstrongNo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		armstrong(n);
	}
	public static void armstrong(int n)
	{
		int r,arm=0;
		int temp=n;
		while(n!=0)
		{
			r=n%10;
			arm=arm+(r*r*r);
			n=n/10;
		}
		if(arm==temp)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");
	}

}
