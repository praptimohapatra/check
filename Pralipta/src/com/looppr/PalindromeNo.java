package com.looppr;

import java.util.*;
public class PalindromeNo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 int n=sc.nextInt();
		 
		 int res=palindrome(n);
		 if(res==n)
				System.out.println("Number is palindrome "+res);
			else
				System.out.println("Number is not palindrome "+res);
	}
	public static int palindrome(int n)
	{
		int r,rev=0;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		
		return rev;
	}

}
