package com.array;

import java.util.*;
public class ArrayP {
         public static void main(String[] args)
         {
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("Enter the size of an array:");
        	 int n=sc.nextInt();
        	 int[] arr=new int[n];
        	 System.out.println("enter the element:");
        	 for(int i=0;i<n;i++)
        	 {
        
        		 arr[i]=sc.nextInt();
        	 }
        	 for(int i=0;i<n;i++)
        	 {
        		 if(arr[i]%2==0)
        		 {
        			 System.out.println("even "+arr[i]);
        		 }
        		 else
        		 {
        			 System.out.println("not even "+arr[i]);
        		 }
        	 }  
        	 
         }
}
