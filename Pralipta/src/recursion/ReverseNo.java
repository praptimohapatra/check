package recursion;

public class ReverseNo {
	 public static void main(String[] args)
     {
     	System.out.println(reverse(12756));
           
     }
     public static int reverse(int n)
     {
    	 if(n<=9)
    		 return n;
    	 
     	   System.out.print(n%10);
          return reverse(n/10);
     }
}
