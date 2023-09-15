package com.looppr;

import java.util.Scanner;

public class PrimeNoRange {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range:");
		int range=sc.nextInt();
		
		rangePrime(range);
	}
	public static void rangePrime(int range)
	{
		
		for(int n=2;n<range;n++)
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
				System.out.println("The range of the prime number: "+n);
		}

	}


}
