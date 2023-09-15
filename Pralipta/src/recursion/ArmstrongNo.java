package recursion;

public class ArmstrongNo {
            public static void main(String[] args)
            {
             
            	if((arm(1634,4))==1634)
            	{
            	    System.out.println("number is Armstrong");
            	}
            	else
            	{
            		System.out.print("Number is not armstrong");
            	}
            }
            public static int arm(int n, int exp)
            {
            	
            	if(n==0)
            		return 0;
            	return PowerOfNo.pow(n%10, exp)+arm(n/10,exp);
            }
            public static int arm(int n)
            {
            	String s=n+"";
            	int count=s.length();
            	return arm(n,count);
            }
}
