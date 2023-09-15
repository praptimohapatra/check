//wap that display all Armstrong number up to range.

 import java.util.*;
 class ArmstrongRange
 {
  public static void main(String[] args)
   {
      
     Scanner sc= new Scanner(System.in);
      System.out.println("Enter the first number:");
        int num1=sc.nextInt();

       System.out.println("Enter the second number:");
        int num2=sc.nextInt();
      
    for(int i=num1;i<num2;i++)
     { 
       int check,rem,sum=0;
         check=i;
      while(check!=0)
       {
         rem=check%10;
         sum=sum+(rem*rem*rem);
         check=check/10;
       } 
     if(sum==i)
        System.out.println(" "+ i+" is an armstrong number");
    }  
   }
    
 }