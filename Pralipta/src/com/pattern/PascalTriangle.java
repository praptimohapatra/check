package com.pattern;

public class PascalTriangle {
	public static void main(String[] args)
	{
	  int [][] arr=pascal(5);
	  int spaces = arr.length-1;
	  for(int i=0; i<=arr.length;i++)
	  {
		  for(int j=1; j<=spaces;j++)
			  System.out.print(" ");
		  for(int j=0;j<arr[i].length;j++)
			  System.out.print(arr[i][j]+" ");
		  spaces--;
		  System.out.println();
	  }
	}
	public static int[][] pascal(int n)
	{
		int [][] arr= new int[n][];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new int[i+1];
			for(int j=0; j<arr[i].length; j++)
			{
				if( j==0 || j==arr[i].length-1)
					arr[i][j]=1;
				else
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		return arr;
	}
}
