package recursion;

public class SingleDg {
	public static void main(String[] args)
    {
      //sum1(2438);
     // int res=sum1(2438);
      System.out.println(sum1(15345));
      //sum2(res);
      //int res1=sum2(res);
     // System.out.println(res1);
    }
    public static int sum1(int n)
    {
    
    	   if(n==0) {
    		 return 0;
    	   }
    	   int a= n%10+sum1(n/10);
    	   if(a<=9)
    		   return a;
    	   return sum1(a);
    
    }
   // public static int sum2(int sum1)
    {
    
    	  // if(sum1==0) {
    		//return 0;
    	   }
    	   //return sum1%10+sum2(sum1/10);
    
   // }
}
