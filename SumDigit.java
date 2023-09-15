//wap display sum of the digits.
import java.util.*;
class SumDigit
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
        int n=sc.nextInt();
       
       int r,sum=0;
      while(n!=0)
      {
        r=n%10;
        sum=sum+r;
        n=n/10;
      }
    System.out.println("Sum of digit " + sum);
     
  }
}