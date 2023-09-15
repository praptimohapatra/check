package com.jspyder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SaveUserPreparedStatement {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
			Statement stmt = con.createStatement();
			
			boolean flag = true;
			while(flag)
			{
				System.out.println("Enter id,name,email,pwd,mobile ");
				int id=sc.nextInt();
				String name=sc.next();
				String email=sc.next();
				String pwd=sc.next();
				long mobile=sc.nextLong();
				
				int update=stmt.executeUpdate("insert into user values("+id+",'"+name+"','"+email+"','"+pwd+"',"+mobile+")");
				System.out.println("data inserted");
				
				System.out.println("Do you want to insert one more row\n 1 for yes\n num for no");
				int choice =sc.nextInt();
				if(choice!=1)
				{
					flag = false;
				}
				System.out.println("___________________THANK YOU____________________");
				con.close();
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
