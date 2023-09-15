 package com.jspyder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id,name,salary,age,email,pwd");
		int id=sc.nextInt();
		String name=sc.next();
		Double salary=sc.nextDouble();
		int age =sc.nextInt();
		String email=sc.next();
		String pwd=sc.next();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=
					DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO employee1 values("+id+",'"+name+"',"+salary+","+age+","+email+","+pwd+")";
			
			stmt.execute(sql);
			
			con.close();
			System.out.println("data has been inserted successfully");
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
	}

}
