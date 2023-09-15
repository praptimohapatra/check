package com.hw;

public class ReverseNo {
	static int rev=0;
	public static void main(String[] args)
	{
		System.out.println(reverse(123));
	}
	public static int reverse(int n)
	{
		int r=0;
		if(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			reverse(n);
		}
		return rev;

				
				
				
				
				
				
				
				
		
	}

}
