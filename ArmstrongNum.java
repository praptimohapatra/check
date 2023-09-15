//wap input a number check number is Armstrong.

 import java.util.*;
 class ArmstrongNum
 {
  public static void main(String[] args)
   {
     Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number:");
        int n=sc.nextInt();
        int r,sum=0; 
         int arm=n;
      while(n!=0)
       {
         r=n%10;
         sum=sum+(r*r*r);
         n=n/10;
       } 
     if(sum==arm)
        System.out.println("Number is Armstrong:" + sum);
     else
        System.out.println("Number is Not Armstrong:" + sum); 
   }
    
 }