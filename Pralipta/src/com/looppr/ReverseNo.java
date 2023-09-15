package com.looppr;

import java.util.*;
public class ReverseNo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 int n=sc.nextInt();
	   
		 reverse(n);
	}
    public static void reverse(int n)
    {
    	int r,rev=0;
    	while(n!=0)
    	{
    		r=n%10;
    		rev=rev*10+r;
    		n=n/10;
    	}
    	System.out.println(rev);
    }
}
