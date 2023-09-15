//wap input a number check number is Armstrong.

 import java.util.*;
 class StrongNum
 {
  public static void main(String[] args)
   {
     Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number:");
        int n=sc.nextInt();
        int fact,r,sum=0; 
         int temp=n;
      while(n!=0)
       {
         r=n%10;
         fact=1;
         for(int i=1;i<=temp;i++)
         {
           fact=fact*i;
         }
         sum=sum+fact;
         n=n/10;
       } 
     if(sum==n)
        System.out.println("Number is Strong ");
     else
        System.out.println("Number is Not Strong "); 
   }
    
 }