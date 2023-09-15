//Wap to print Multiplication table.
 import java.util.*;
 class MultiplicationTab
 {
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of i:");
       int i=sc.nextInt();
        int j;

      for(i=2;i<=12;i++)
       {
         for(j=1;j<=10;j++)
          {
            System.out.println("Num " +(i*j) );
          }
        System.out.println();
      }
   }
 }

 