package recursion;

public class SumOfSqrDg {
	 public static void main(String[] args)
     {
     	System.out.println(sqr(1234));
     }
     public static int sqr(int n)
     {
     
     	   if(n==0) {
     		 return 0;
     	   }
     	   return (n%10)*(n%10)+sqr(n/10);
     
     }
}
