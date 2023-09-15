//wap input a number check number is perfect or not.
 import java.util.*;
 class PerfectNum
 {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
       int n=sc.nextInt();

    int i=1, sum=0;
    while(i<=n/2)
     {
       if(n%i==0)
        {
          sum=sum+i;
        }
         i++;  
     }
     if(sum==n)
        System.out.println(" "+ n+" Number is perfect");
     else
        System.out.println(" "+n+" Number is not perfect");
  }
 }