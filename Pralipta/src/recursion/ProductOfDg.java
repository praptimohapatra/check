package recursion;

public class ProductOfDg {
	 public static void main(String[] args)
     {
     	System.out.println(prod(1234));
     }
     public static int prod(int n)
     {
     
     	   if(n==0) 
     		  return 1;
     	   
     	   return n%10*prod(n/10);
     
     }
}
