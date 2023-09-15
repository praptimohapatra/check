//Wap to find the large of two number.
import java.util.*;
class LargeNum
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
        int n1=sc.nextInt();
     System.out.println("Enter the another number:");
        int n2=sc.nextInt();

      if(n1!=n2)
       {
         if(n1>n2)
             System.out.println("The larger value is:"+ n1);
         else
             System.out.println("The larger value is:"+ n2);
       }
       
  }
}