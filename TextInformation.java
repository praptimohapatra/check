import java.util.Scanner;
class TextInformation
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("Information of the employee:");
     System.out.println("===========================");
     
     System.out.println("Enter the name: ");
        String name=sc.nextLine();
       
      System.out.println("Enter the age: ");
        int age=sc.nextInt();
          sc.nextLine();

      System.out.println("Enter the address: ");
          String addr=sc.nextLine();

       System.out.println("Enter the salary: ");
           double sal=sc.nextDouble();

       System.out.println("The Information of the employee is ");
        System.out.println("================================== ");


        System.out.println("The name is " + name);
         System.out.println("The age is " + age );
         System.out.println("The address is " + addr);
          System.out.println("The salary is " + sal);
     }
}


     
  