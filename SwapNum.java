//Wap to swap two number without using third variable.
import java.util.*;
class SwapNum
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter two number:  ");
      int n1=sc.nextInt();
      int n2=sc.nextInt();
       
      n1=n1+n2;
      n2=n1-n2;
      n1=n1-n2;
    System.out.println("After Swapping: " + n1+' ' + n2);
      

  }
}