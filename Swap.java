//Wap to swap two number using third variable.
import java.util.*;
class Swap
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter two number:  ");
      int n1=sc.nextInt();
      int n2=sc.nextInt();
       int temp;
      temp=n1;
       n1=n2;
      n2=temp;
    System.out.println("After Swapping: " + n1+' ' + n2);
      

  }
}