package com.looppr;
import java.util.*;
public class AlternativePrimeNo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range:");
		int range=sc.nextInt();
		
		altPrime(range);
	}
	public static void altPrime(int range)
	{
		int alt_c=0;
		
		for(int n=1;n<=range;n++)
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
			{
				alt_c++;
				if(alt_c%2!=0)
					System.out.println(n);
			}
				
	
		}

	}


}
