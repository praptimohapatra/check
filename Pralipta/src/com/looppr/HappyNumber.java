package com.looppr;

import java.util.*;
public class HappyNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int res=n;
		while(res!=1 && res!=4) {
			res=happy(res);
		}
			
		if(res==1)
			System.out.println(n+" is a happy no");
		else if(res==4)
			System.out.println(n+" is not a happy no");
	}
	public static int happy(int n)
	{
		int r,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+(r*r);
			n=n/10; 
		}
		return sum;
	}

}
