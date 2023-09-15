package pkg1;

public class Pattern8 {
	public static void main(String[] args)
    {
    	int n=6;
    	for(int i=1;i<=n;i++)
    	{
    		for(int s=0;s<=i-1;s++) {
    			System.out.print(" ");
    		}
    		for(int j=1;j<=n-i;j++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
