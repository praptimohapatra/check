//wap input check the range of  Strong.

 import java.util.*;
 class StrongRange
 {
  public static void main(String[] args)
   {
     Scanner sc= new Scanner(System.in);
      System.out.println("Enter first number:");
        int n1=sc.nextInt();
	System.out.println("Enter second number:");
        int n2=sc.nextInt();

        int fact,r,sum=0; 
         
     for(int i=n1;i<n2;i++)
     {
       int temp=i;
      while(i!=0)
       {
         r=i%10;
         fact=1;
         for(int j=1;j<=temp;j++)
         {
           fact=fact*i;
         }
         sum=sum+fact;
         i=i/10;
       } 
       if(sum==i)
          System.out.println(" "+ i+" Number is Strong ");
     } 
   }
    
 }