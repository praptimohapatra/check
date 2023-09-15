//wap input a number check number is palindrome.

 import java.util.*;
 class PalindromeNum
 {
  public static void main(String[] args)
   {
     Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number:");
        int n=sc.nextInt();
        int r,rev=0,temp; 
         temp=n;
      while(n!=0)
       {
         r=n%10;
         rev=(rev*10)+r;
         n=n/10;
       } 
     if(rev==temp)
         System.out.println("Number is palindrome:"+ rev );
     else
         System.out.println("Number is not Palindrome:" + rev);
   }
    
 }