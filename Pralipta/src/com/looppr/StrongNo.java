package com.looppr;

import java.util.*;
public class StrongNo {
	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a range:");
		int range=sc.nextInt();
		
		rangeStrong(range);
	}
	public static void rangeStrong(int range)
	{
		int r,sum=0,n;
		//int temp=n;
		for( n=1;n<=range;n++)
		{
		   while(n!=0)
		   {
			  r=n%10;
			  int fact=1;
			  for(int i=1;i<=r;i++)
			  {
				  fact=fact*i;
			  }
			  sum=sum+fact;
			  n=n/10;
		  }
		  if(n==sum)
			   System.out.println("strong no are: "+n);
	
		}
	}
		
	
	
	
		
	
}
