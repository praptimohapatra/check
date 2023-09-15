//wap print first sum n natural number.
import java.util.Scanner;
class SumN
{
  public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n: ");
       int n=sc.nextInt();
       int i,sum=0;
     
       for(i=1;i<=n;i++)
         {
           sum=sum+i;
         }
       System.out.println("the sum is:" + sum);  
   }
}
