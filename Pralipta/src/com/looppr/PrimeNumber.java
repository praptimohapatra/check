package com.looppr;

import java.util.*;
public class PrimeNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 int n=sc.nextInt();
		  
		primeNo(n);
		
	}
	public static void primeNo(int n)
	{
		int c=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				c++;
				break;
			}
		}
		if(c==0)
		   System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	
	}

}
