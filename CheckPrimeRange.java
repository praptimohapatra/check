//wap print prime 1 to 100.
import java.util.*;
class CheckPrimeRange
{
 public static void main(String[] args)
 {
       int n,i;
    for(n=1;n<=100;n++)
     {
        int count=0;
       for(i=2; i<=n/2; i++)
        {
          if(n%i==0)
           {
             count++;
           }
        }
    	if(count==0)
     	{
      	System.out.println(n);
     	} 
    	
     }    
 } 
}
