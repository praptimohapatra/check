package com.array;

import java.util.*;
public class LinearSearch1 {
            public static void main(String[] args)
            {
            	Scanner sc=new Scanner(System.in);
            	int[] arr= {5,1,2,76,43,12,23};
            	System.out.println("Enter the Key value: ");
            	
            	int key=sc.nextInt();
            	boolean flag=true;
            	for(int i=0;i<arr.length;i++)
            	{
            		if(key==arr[i])
            		{
            			flag=false;
            			System.out.println(key+ " is  found"+i);
                         break;
            		}
            	}
            	if(flag)
            	{
            		System.out.println("Element is not found:");

            	}
            }
}
