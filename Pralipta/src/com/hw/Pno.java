package com.hw;

public class Pno {
	static int i=2;
	public static void main(String[] args) {
			System.out.println(primeCheck(5,15));


	}
	public static boolean primeCheck(int n,int r)
	{
		if(n<r)
		{
		  if(i==n/2)
		     return true;
		
	      if(n%i==0)
		     return false;
	     i++;
	    
		}
	   return primeCheck(n,r);
	}

}
