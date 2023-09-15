//wap that display all leap years min range to max range.
import java.util.*;
class RangeYear
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the lowest year:");
       int miny=sc.nextInt();
    System.out.println("Enter the highest year:");
       int maxy=sc.nextInt();
  
     System.out.println("Leap years in given range are:");
       for(int i=miny;i<=maxy;i++)
        {
          if(((i%4==0) && (i%100!=0)) || (i%400==0))
              System.out.println(" Range of year"+i);
        } 

  }
}