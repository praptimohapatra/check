package com.pattern;

import java.util.*;
public class Pattern1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j<=n-1 && i<=j)||(i+j>=n-1 && i>=j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println( );
		}
	}
}
