package com.looppr;

import java.util.*;
public class PowerOfNo {
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the base: ");
		 int b=sc.nextInt();
		 System.out.println("Enter the power: ");
		 int p=sc.nextInt();
		  
		 int res=power(b,p);
		 System.out.println(res);
		 	 
	}
	public static int power(int b,int p)
	{
		int prod=1;
		for(int i=b;i>=p;i--)
		{
			prod=prod*b;
		}
		return prod;
	}

}
