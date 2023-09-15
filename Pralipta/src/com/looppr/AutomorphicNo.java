package com.looppr;

import java.util.*;
public class AutomorphicNo {
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
	    int n=sc.nextInt();
	    
	    System.out.println(automorphic(n));
	}
	public static boolean automorphic(int n)
	{
		int sq=n*n;
		while(n!=0)
		{
			if(n%10 != sq%10)
			    return false;
			n=n/10;
			sq=sq/10;
			
		}
		return true;
	}

}
