class Tesst
{
 public static Tesst m1()
 {
   System.out.println("Lee min Ho");
  return new Tesst(); 
 }
public static void main(String[] args)
 {
   Tesst t=m1();
   System.out.println(t);
 }

}