//Wap to create calculator.
import java.util.*;
class Calculator
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter two number: ");
       int n1=sc.nextInt();
       int n2=sc.nextInt();
     System.out.println("Enter a choice (Add,Sub,Mul,Div) ");
        String ch=sc.next();
      switch(ch)
         {
          case "Add": System.out.println("Addition: "+ (n1+n2));
                       break; 
          case "Sub":System.out.println("Substraction: "+ (n1-n2));
                       break; 
          case "Mul":System.out.println("Multiplication: "+ (n1*n2));
                       break; 
          case "Div":System.out.println("Division: "+ (n1/n2));
                      break;           
          default:System.out.println("invalid choice");
         }


  }
}