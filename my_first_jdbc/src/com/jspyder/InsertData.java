package com.jspyder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) {
		
          try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
	       Statement stmt=con.createStatement();
	       
	       while(true)
	       {
	    	Scanner sc=new Scanner(System.in); 
	    	System.out.println("Enter employee eno");
	   		int eno=sc.nextInt();
	   		sc.nextLine();
	   		System.out.println("Enter employee ename");
	   		String ename=sc.next();
	   		System.out.println("Enter employee salary");
	   		double sal =sc.nextDouble();
	   		sc.nextLine();
	   		System.out.println("Enter address");
	   		String addr=sc.next();
	   		
	   		String sql1=String.format("insert into employee5 values(%d,'%s',%f,'%s')",eno,ename,sal,addr);
	   		stmt.execute(sql1);
	   		System.out.println(" data inserted");
	   		System.out.println("Do You want to insert more data");
	   		 String opt=sc.next();
	   		 //sc.nextLine();
	   		 
	   		 if(opt.equalsIgnoreCase("No"))
	   		 {
	   			 break;
	   		 }
	   		 
	   		 
	   	    sc.nextLine();
	       }
	 
	       con.close();
	     
	       
	
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

}
