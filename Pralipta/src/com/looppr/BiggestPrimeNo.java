package com.looppr;

import java.util.*;
public class BiggestPrimeNo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range:");
		int range=sc.nextInt();
		
		biggestPrime(range);
	}
	public static void biggestPrime(int range)
	{
		
		for(int j=range;j>=2;j--)
		{
			int c=0;
			int n=j;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
				 c++;
				 break;
				}
			}

			if(c==0)
			{
					System.out.println("The range of the prime number: "+n);
			}
		}

	}
}
