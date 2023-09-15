//Wap to find factorial of the number.
import java.util.*;
class Factorial
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println();
       int n=sc.nextInt();
      int i,fact=1;

     for(i=n;i>=1;i--)
      {
         fact=fact*i;
      }
      System.out.println("factorial of the number is:" + fact);     
 
  }
}