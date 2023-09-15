package com.sortsearch;

import java.util.Scanner;

public class Selectionsort1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n =sc.nextInt();
		int[] a=new int[n];
		

		for(int i=0;i<n;i++)
		{
		 System.out.print("Enter the element:");
		 a[i]=sc.nextInt();
		}
		selectionSort(a);
	}
		static void selectionSort(int[] a)
		{
			int min,temp=0;
			for(int i=0;i<a.length;i++)
			{
				min=i;
			  for(int j=i+1;j<a.length;j++)
			  {
				  if(a[j]<a[min])
				  {
					  min=j;
				  }
			  }
			  temp=a[i];
			  a[i]=a[min];
			  a[min]=temp;
			  
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+","); 
			}
				
		}
	

}
