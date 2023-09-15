package com.array;

public class SecondHighest {
	public static void main(String[] args)
	{
		int[] arr= {1,5,8,11,6,4,12,10};
		
		int first=0;
		int second=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second && arr[i]!=first)
			{
				second=arr[i];
			}
		}
		System.out.println(second);
	}

}
