package com.jspyder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class VerifyingUser2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
			Statement stmt = con.createStatement();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your email");
			String email=sc.next();
			System.out.println("Enter your password");
			String pwd=sc.next();
			
			String sql = "SELECT * FROM user WHERE email='"+email+"'";
			
			ResultSet rst =stmt.executeQuery(sql);
			if(rst.next())
			{
				String dbpwd = rst.getString("pwd");
				if(pwd.equals(dbpwd))
				{
					System.out.println("Welcome to home page");
				}
				else
				{
					System.out.println("Invalid password");
				}
			}
			else
				System.out.println("Invalid email id");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
