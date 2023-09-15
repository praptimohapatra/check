package com.looppr;
import java.util.*;
public class BinaryToDecimal {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		bintodec(n);
	}
	public static void bintodec(int n)
	{
		int d=0;
		int temp=n;
		int r,i=0;
		while(temp!=0)
		{
			r=temp%10;
			temp=temp/10;
			d=d+r*(int)Math.pow(2, i++);
		}
		System.out.println("Decimal equivalent of "+n+" is "+d);
	}

}
