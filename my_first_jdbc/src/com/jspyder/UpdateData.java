package com.jspyder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) throws Exception {
		{
			Scanner sc=new Scanner(System.in);
			//System.out.println("Enter sal to update");
			//double sal=sc.nextDouble();
			
			//System.out.println("Enter name");
			//String name=sc.next();
			String sql="update employee5 set sal=case ename when 'pabitra' then 30000 when 'Riyaz' then 40000 else sal end where ename in('pabitra','Riyaz')";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
				Statement st=con.createStatement();
				st.execute(sql);
				con.close();
				System.out.println("data updated");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
