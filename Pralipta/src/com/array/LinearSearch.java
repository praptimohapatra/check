package com.array;

public class LinearSearch {
           public static int linearsrc(int[] arr,int k)
           {
        	   int n=arr.length;
        	   for(int i=0;i<n;i++)
        	   {
        		   if(arr[i]==k)
        		   {
        			   return i;
        		   }
        	   }
        	   return -1;
           }
           public static void main (String[] args)
           {
        	   int arr[]= {2,41,44,86,51};
        	   int k=23;
        	   int res=linearsrc(arr,k);
        	    
        	   if(res==-1)
        	   {
        		   System.out.println("Element is not found");
        	   }
        	   else
        	   {
        		   System.out.println("Element is  found at index "+ res);

        	   }
           }
}
