class A
{
  public static void main(String[] args)
  {
    int x=m1();
    System.out.println(x);
    System.out.println(m1());

  }
  public static char m1()
  {
    System.out.println("no arg method");
    return 10;
  }

}