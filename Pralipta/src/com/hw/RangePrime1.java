package com.hw;

public class RangePrime1 {
	static int i=1;
	static int count=0;
	static int temp;
	public static void main(String[] args)
	{
		pC(5,15);
		
	}
	public static int primeNo1(int stnum,int i)
	{
             if(i<=stnum/2)
			  {
				if(stnum%i==0)
				{
				  count++;
				}
				i++;
				primeNo1(stnum,i);
				
			}
		if(count==2)
		{
			System.out.println(stnum);
		}
		//temp=n;
		i=1;
		count=0;
		return stnum;
	}
	public static void pC(int stnum,int endnum)
	{
	   if(stnum<=endnum)
	   {
		   primeNo1(stnum,i);
		   if(stnum%2!=0 && stnum%3!=0)
		       System.out.println(stnum);
		   stnum++;
		   pC(stnum,endnum);
		   
	   }
	}
	

}
