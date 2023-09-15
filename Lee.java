class Lee
{
 public void m1(Object o)
 {
  System.out.println("I Like You");
 }
 public void m1(A a1)
 {
  System.out.println("I admire you");
 } 
 public void m1(B b1)
 {
  System.out.println("I like the way that you present your self");
 }
 public static void main(String[] args)
 {
   C c1=new C();

  Lee l1=new Lee();
   l1.m1(c1);
   
 }
}