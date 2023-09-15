package com.looppr;

import java.util.*;
public class FibonacciNo {
         public static void main(String[] args)
         {
        	 Scanner sc=new Scanner(System.in);
             System.out.println("Enter a number: ");
     	     int n=sc.nextInt();
     	    
     	     System.out.println(fibonacci(n));
         }
         public static int fibonacci(int n)
         {
        	 int f,l,s;
             f=0;
             l=1;
             s=0;
            System.out.print(""+f);
             System.out.print(""+l);
           for(int i=2;i<=n;i++)
            { 
              s=f+l;
              f=l;
              l=s; 
              System.out.print(" "+ s);
            }
           return s;
         }
}
