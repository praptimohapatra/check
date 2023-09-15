package recursion;

public class Strongno {
	 public static void main(String[] args)
     {
     	int n=145;
     	int strong=strong(n);
     	if(strong == n)
     	{
     		System.out.println("Strong number");
     	}
     	else
     	{
     		System.out.println("Not a strong number");
     	}
     }
     public static int strong(int n)
     {
     
     	   if(n==0) 
     		  return 0;
     	   
     	   return Factorialno.fact(n%10)+strong(n/10);
     
     }
     
}
