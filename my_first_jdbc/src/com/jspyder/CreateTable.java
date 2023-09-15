package com.jspyder;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateTable {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
	       Statement stmt=con.createStatement();
	       
	       
	     String sql="create table employee5(eno int , ename varchar(45),sal double, addr varchar(45)) ";
	     
	
	       stmt.execute(sql);
	       con.close();
	       System.out.println("table is created");
	      
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
