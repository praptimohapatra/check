package pkg1;

 abstract class D {
	final void m1()
	{
		System.out.println("final");
	}
	
	

}
public class Aaa extends D
{
	public static void main(String[] args)
	{
		Aaa a1=new Aaa();
		a1.m1();
	}
}
