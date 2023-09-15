package com.looppr;

import java.util.*;
public class XylemPhloem {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		xylemPhloem(n);

	}
	public static void xylemPhloem(int n)
	{
		int r,out_sum=0,in_sum=0;
		int temp=n;
		while(temp!=0)
		{
			if(temp==n || temp<10)
			{
			 r=temp%10;
			 out_sum=out_sum+r;
			}
			else
			{
				r=temp%10;
				in_sum=in_sum+r;
			}
			temp=temp/10;
		}
		System.out.println("The out sum "+out_sum);
		System.out.println("The inner sum "+in_sum);
		
		if(out_sum==in_sum)
			System.out.println("Number is Xylem");
		else
			System.out.println("Number is phloem");
	}

}
