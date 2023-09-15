class A
{
}
class B extends A
{
}
class C extends B
{
}

class LeeMinHo
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

  Lee l=new Lee();
   l.m1(c1);
   l.m1(null);
   
 }
}