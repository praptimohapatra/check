package recursion;


public class NaturalSum {
           public static void main(String[] args)
           {
        	   System.out.println(sum_no(5));
           }
           public static int sum_no(int n)
           {
        	   if (n==0)
        		   return 0;
        	    
        	   return n+sum_no(n-1);
           }
           
}
