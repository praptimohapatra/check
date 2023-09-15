package pkg1;

public class Pinnochio {
	public static void main(String[] args)
	{
	   pinaki(1);	
	}
	public static void pinaki(int n)
	{
		System.out.println(n);
		if(n<10)
		{
			n++;
		    pinaki(n);
		}
	}

}
