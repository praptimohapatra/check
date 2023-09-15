package com.pattern;

public class PatternOne {
	
           public static void main(String[] args)
           {
        	   int n=7;
        	  int space=n/2;
        	  int star=8;
        	  for(int i=1;i<=n;i++)
        	  {
        		  for(int j=2;j<=space;j++)
        		  {
        			  System.out.print(" ");
        		  }
        		  for(int j=1;j<=star;j++)
        		  {
        			  System.out.println("*");
        			  if(i<=n/2)
        			  {
        				  star--;
        				  space=space+2;
        			  }
        			  else {
        				  star++;
        				  space=space-2;
        			  }
        		  }
        	  }
        	  System.out.println();
           }
}
