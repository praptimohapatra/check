import java.util.Scanner;
class Pattern7
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n: ");
      int n=sc.nextInt();

     for(int i=0;i<n;i++)
     {
       for(int j=0;j<n;j++)
        {
          if((i+j<=n-1 && i<=j)||(i+j>=n-1 && i>=j))
            System.out.print("*");
          else
            System.out.print(" ");       
        }
       System.out.println();  
     }
     
   }
}