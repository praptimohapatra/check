import java.util.Scanner;
class Pattern11
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of n: ");
              int n=sc.nextInt();
       System.out.println("Enter the value of m: ");
             int m=sc.nextInt();

     for(int i=0;i<n;i++)
     {
       for(int j=0;j<m;j++)
        {
          if((i+j<=n-1 && i<=j)||(i+j>=n-1 && i>=j))
               System.out.print(" ");
          else
            System.out.print(" *");       
        }
       System.out.println();  
     }
     
   }
}