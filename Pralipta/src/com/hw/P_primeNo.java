package com.hw;

public class P_primeNo {
	static int count=0;

	public static void main(String[] args) {
       primeCheck(8,1);
       if(count==2)
       {
    	   System.out.println("The Number is prime ");
       }
       else
       {
    	   System.out.println("The number is not prime");
       }

	}
	public static void primeCheck(int n,int i)
	{
	
		if(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
			primeCheck(n,i);
		}
	}


}
