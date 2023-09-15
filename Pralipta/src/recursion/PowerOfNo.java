package recursion;

public class PowerOfNo {
	 public static void main(String[] args)
     {
  	   System.out.println(pow(2,4));
     }
     public static int pow(int b,int p)
     {
  	   if (p==0)
  		   return 1;
  	    
  	   return b*pow(b,p-1);
     }
}
