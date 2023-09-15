package com.jspyder;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ExecutingSteps {
	public static void main(String[] args)
	{
		try
		{
			Driver d=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(d);
			System.out.println("Registration done");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
