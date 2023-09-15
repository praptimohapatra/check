import java.utill.*;
class SingleDigit
{
 public static void main(String[] s)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n:");
       int n=sc.nextInt();
     int rem,sum=0;
     int sum1;
   while(sum1>=10)
   {
     sum1=sum;
      while(n!=0)
       {
          rem=n%10;
          sum=sum+rem;
           n=n/10;
       }
      sum=sum/10;
    }
    System.out.print("Sum of Single digit:"+sum1);
  }

}