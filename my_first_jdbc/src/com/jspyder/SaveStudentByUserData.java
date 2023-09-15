package com.jspyder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SaveStudentByUserData {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id,name,age,mobile");
		int id=sc.nextInt();
		String name=sc.next();
		int age =sc.nextInt();
		long mobile=sc.nextLong();
		
		try {
			//load and register
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Establish connection
		
		    Connection con=
					DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO student1 values("+id+",'"+name+"',"+age+","+mobile+")";
			stmt.execute(sql);
			
			con.close();
			System.out.println("inserted");
			
			
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
	}

}
