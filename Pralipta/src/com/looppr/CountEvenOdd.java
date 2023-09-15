package com.looppr;

import java.util.*;
public class CountEvenOdd {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number: ");
	 int n=sc.nextInt();
	
	 countevod(n);
	}
    public static void countevod(int n)
    {
    	int rem,even=0,odd=0;
    	while(n!=0)
    	{
    		rem=n%10;
    		if(n%2==0)
    		{
    			even++;
    			
    		}
    		else
    		{
    			odd++;
    		}
    		n=n/10;
    	}
    	System.out.println("Even numbers are "+even);
    	System.out.println("Odd numbers are "+odd);
    	
    }
}
