package pkg1;

public class SumOfDg {
        public static void main(String[] args)
        {
        	System.out.println(sum1(2438));
        }
        public static int sum1(int n)
        {
        
        	   if(n==0) {
        		 return 0;
        	   }
        	   return n%10+sum1(n/10);
        
        }
}
