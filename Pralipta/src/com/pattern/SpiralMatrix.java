package com.pattern;

public class SpiralMatrix {
	public static void main(String[] args)
	{
		int n=5;
		int[][] arr=new int[n][n];
		int col=-1;
		int row=0;
		char direction='r';
		for(int i=1;i<n*n;i++)
		{
			switch(direction)
			{
			case 'r':
			{
				col++;
				arr[row][col]=1;
				if(col==arr.length || col!=0);
				direction ='b';
			}
			case 'b':
			{
				row++;
				arr[row][col]=1;
				if(col==arr.length || col!=0);
				
			}
			case 'l':
			{
				
			}
			case 't':
			{
				
			}
			for(int[] x:arr)
			{
				for
			}
			}
		}
	}

}
