package com.hw;

public class EvenNo {
	public static void main(String[] args) {
		even(10,20);
	}
	public static void even(int n,int m)
	{
		if(n<m)
		{
			if(n%2==0)
			   System.out.println("even no's are: "+n);
			n++;
			even(n,m);
			
		}
	
	}


}
