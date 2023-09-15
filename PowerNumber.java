//wap power of a number.
import java.util.*;
class PowerNumber
{
  public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
        int n=sc.nextInt();
      System.out.println("Enter a power:");
         int p=sc.nextInt();
         
         int i=1,sum=1;
         while(i<=p)
         {
           sum=sum*n;
            i++;
         }  
      System.out.println("Number of the Power is:"+ sum);
   }
}