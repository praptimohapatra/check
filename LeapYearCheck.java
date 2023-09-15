//Wap to check of LeapYear.
import java.util.*;
class LeapYearCheck
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter a Year:");
      int year=sc.nextInt();
      
     if(year%4==0 && year%100==0)
       System.out.println("Year is Leap year:"+ year);
     else
       System.out.println("Year is not Leap year:" + year);
  }
}