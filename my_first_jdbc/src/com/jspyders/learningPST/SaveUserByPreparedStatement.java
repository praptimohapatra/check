package com.jspyders.learningPST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveUserByPreparedStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
			PreparedStatement pst = con.prepareStatement("insert into user(id,name,email,pwd,mobile) values(? ,?,?,?,?)");
					
					pst.setInt(1, 191);
		            pst.setString(2, "deepali");
		            pst.setString(3,"depali@gmail.com");
		            pst.setString(4, "depa2343");
		            pst.setLong(5, 998567432);
		            
		            pst.executeUpdate();
		            System.out.println("inserted");
		            con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
