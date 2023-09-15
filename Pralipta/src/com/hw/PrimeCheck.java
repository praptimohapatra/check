package com.hw;

public class PrimeCheck {
	public static void main(String[] args)
	{
		int n,p;
		 n=15;
		 p=primeCk(n,n/2);
		 if(p==1)
			 System.out.println("Number is prime");
		 else
			 System.out.println("Number is not prime");
		
				
	}
	public static int primeCk(int n,int i)
	{
		if(i==1)
			return 1;
		if(n%i==0)
			return 0;
		
		return primeCk(n,i-1);
	}


}
