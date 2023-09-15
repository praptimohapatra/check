package com.looppr;
 
import java.util.*;
public class SumOfEvenAndOdd {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 int n=sc.nextInt();
		 
		 evenOddSum(n);
	}
    public static void evenOddSum(int n)
    {
    	int rem,evensum=0,oddsum=0;
    	while(n!=0)
    	{
    		rem=n%10;
    		if(rem%2==0)
    		{
    			evensum=evensum+rem;
    		}
    		else
    		{
    			oddsum=oddsum+rem;
    			
    		}
    		n=n/10;
    	}
    	System.out.println("Sum of even number: "+evensum);
    	System.out.println("Sum of odd number: "+oddsum);

    }
}
