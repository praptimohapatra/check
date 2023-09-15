package com.jspyders.learningPST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SaveUserByPreparedStatement1 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
			PreparedStatement pst=con.prepareStatement("insert into user(id,name,email,pwd,mobile) values(?,?,?,?,?)");
			boolean flag = true;
			while(flag)
			{
				System.out.println("Enter id,name,email,pwd,mobile");
				int id=sc.nextInt();
				String name=sc.next();
				String email=sc.next();
				String pwd=sc.next();
				Long mobile=sc.nextLong();
				
				pst.setInt(1,id);
				pst.setString(2, name);
				pst.setString(3, email);
				pst.setString(4, pwd);
				pst.setLong(5, mobile);
				
				pst.executeUpdate();
				System.out.println("inserted");
				System.out.println("Do you want to insert one more row\n 1 for yes\n any num for no");
				int choice=sc.nextInt();
				if(choice!=1)
				{
					flag=false;
				}
			}
				System.out.println("___________________VISIT AGAIN________________");
				
				con.close();
				
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
