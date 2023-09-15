//Wap to find the largest of two number.
import java.util.*;
class LargestNum
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of n1:");
        int n1=sc.nextInt();
     System.out.println("Enter the value of n2:");
        int n2=sc.nextInt();
     System.out.println("Enter the value of n3:");
        int n3=sc.nextInt();

      if(n1>n2)
       {
         if(n1>n3)
             System.out.println("The largest value is:"+ n1);
         else
             System.out.println("The largest value is:"+ n3);
       }
      else
       {
         if(n2>n3)
          System.out.println("The largest value is:"+ n2);
         else
           System.out.println("The largest value is:"+ n3);
       }
       
  }
}