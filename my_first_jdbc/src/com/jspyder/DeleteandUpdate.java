package com.jspyder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteandUpdate {
	public static void main(String[] args) {
		//try {
		//	Class.forName("com.mysql.cj.jdbc.Driver");
		//	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
		//	Statement stmt = con.createStatement();
			
		//	String sql = "DELETE FROM student1 WHERE id=101";
		//	stmt.execute(sql);
	
		//	 con.close();
		//	 System.out.println(" data deleted from student1 successfully");
	//	} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
			
	//	}
		remove();
		
	}
	public static void remove()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
			Statement stmt= con.createStatement();
			
			String sql = "update student1 set name='plsql' where id=103";
			int Update = stmt.executeUpdate(sql);
			
			con.close();
			System.out.println("data updated from student1 successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
