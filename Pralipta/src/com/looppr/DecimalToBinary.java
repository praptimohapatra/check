package com.looppr;

import java.util.*;
public class DecimalToBinary {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		decToBin(n);
	}
	public static void decToBin(int n)
	{
		String b="";
		int bin=0;
		int r, temp=n;
		while(temp>0)
        {
          r=temp%2;
          temp=temp/2;
           b=r+b;
        }
         
         System.out.println("Binary equivalent of "+n+" is "+b);
	}

}
