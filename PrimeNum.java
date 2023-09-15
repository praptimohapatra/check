//wap check no is prime or not.
import java.util.*;
class PrimeNum
{
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
       int n=sc.nextInt();
       int count=0;

     for(int i=2;i<=n/2;i++)
      {
          if(n%i==0)
	   { 
               count=count+1;
          	break;
 	   }	
      }	
      if(count==0)
       {
         System.out.println("Number is Prime: " + n);
       } 
      else
       System.out.println("Number is not Prime: " + n);
 }
}