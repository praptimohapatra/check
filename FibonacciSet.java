//generate a fibonacci sequence of n numbers.
import java.util.*;
class FibonacciSet
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the range:");
       int r=sc.nextInt();

     int n1,n2,f;
      n1=0;
      n2=1;
     System.out.println(n1);
     System.out.println(n2);
     for(int i=1;i<=r;i++)
      {
        f=n1+n2;
        n1=n2;
        n2=f;
       System.out.println(f);  
      }
  }
 
}
