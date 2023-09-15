package com.array;

import java.util.Scanner;

public class BinarySearch {
        public static void main(String[] args)
        {
        	Scanner sc = new Scanner(System.in);
        	int[] arr= {1,5,7,9,15,30,32,54,68};
        	System.out.println("Enter a search element:");

        	int key=sc.nextInt();
        	int st=0;
        	int end=arr.length-1;
        	boolean flag=true;
        	while(st<=end) {
        		int mid=(st+end)/2;
        	if(key==arr[mid])
        	{
        		flag=false;
        		System.out.println(key+" is found at index"+mid);
        		break;

        	}
        	else if(key>arr[mid])
        	{
        		st=mid+1;
        	}
        	else
        	{
        		end=mid-1;
        	}
        }
        	if(flag)
        	{
        		System.out.println(key+" not found");

        	}
        }
}
