package com.sortsearch;

import java.util.Scanner;

public class Insertionsort {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element: ");
			a[i]=sc.nextInt();
		}
		insertionSort(a);
		
	}
	static void insertionSort(int[] a)
	{
		int temp,j;
		for(int i=0;i<a.length;i++)
		{
			temp=a[i];
			j=i-1;
			while(j>=0 && a[j]>=temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
	}

}
