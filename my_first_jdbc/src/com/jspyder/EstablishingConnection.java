package com.jspyder;

import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishingConnection {
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
			System.out.println("Connection established");
		}
		catch(ClassNotFoundException|SQLException e )
		{
		 e.printStackTrace();
		}
	}

}
