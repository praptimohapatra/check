//wap display all perfect number up to range.
 import java.util.*;
 class PerfectRange
 {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number: ");
       int n1=sc.nextInt();

	System.out.println("Enter second number: ");
         int n2=sc.nextInt();
    for(int i=n1;i<n2;i++)
    {
     int j=1,sum=0;
    while(j<=i/2)
     {
       if(i%j==0)
        {
          sum=sum+j;
        }
         j++;  
     }
     if(sum==i)
        System.out.println(" "+i+" Number is perfect");
   }
  }
 }