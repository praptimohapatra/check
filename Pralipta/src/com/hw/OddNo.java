package com.hw;

public class OddNo {
	public static void main(String[] args) {
		odd(25,55);
	}
	public static void odd(int n,int m)
	{
		if(n<m)
		{
			if(n%2!=0)
			   System.out.println("odd no's are: "+n);
			n++;
			odd(n,m);
			
		}
	
	}

}
