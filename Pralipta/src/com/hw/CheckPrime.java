package com.hw;

public class CheckPrime {
	static int i=2;
	public static void main(String[] args) {
			System.out.println(primeCheck(18));


	}
	public static boolean primeCheck(int n)
	{
		if(i==n/2)
		   return true;
		
	   if(n%i==0)
		   return false;
	   i++;
	   return primeCheck(n);
	}



}
