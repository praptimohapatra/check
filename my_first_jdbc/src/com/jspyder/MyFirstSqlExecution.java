package com.jspyder;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class MyFirstSqlExecution {
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=
					DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO student1 values(105,'plsql',26,9843981967)";
			
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
