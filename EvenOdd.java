///Wap to check for Even or Odd Number. 
import java.util.*;
class EvenOdd
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
      int n=sc.nextInt();
     if(n!=0)
       {
         if(n>0)
            System.out.println("Number is positive:"+ n);
         else
           System.out.println("Number is Negative:"+ n); 
       }
  }
}