package com.jspyders.learningPST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserRespiratory {
	Connection con=null;
	ResultSet rst=null;
	PreparedStatement pst=null;
	static Scanner sc=new Scanner(System.in);
	UserRespiratory()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first_sql","root","08robotic@93");
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void insert_data() throws SQLException
	{
		System.out.println("Enter id,name,mail,sal,age");
		int id=sc.nextInt();
		String ename=sc.next();
		String mail=sc.next();
		double sal=sc.nextDouble();
		int age=sc.nextInt();
		while(true)
		{
			pst = con.prepareStatement("insert into user1(id,ename,mail,sal,age) values(? ,?,?,?,?)");
			pst.setInt(1, id);
		    pst.setString(2, ename);
	        pst.setString(3,mail);
	        pst.setDouble(4, sal);
	        pst.setInt(5, age);
	            
	            pst.executeUpdate();
	            
	            System.out.println("data inserted");
	            break;
	            
		}
	}
	 public void update_data() throws SQLException
	 {
		 System.out.println("Enter salary to update");
		 double sal=sc.nextDouble();
		 
		 System.out.println("Enter id where you want to update");
		 int id=sc.nextInt();
		pst =con.prepareStatement("update user1 set sal=?  where id=?");
			
			pst.setDouble(1,sal);
			pst.setInt(2, id);
			pst.executeUpdate();
			//con.close();
	        System.out.println("data update");
	       
		
	}
	 public void delete_data() throws SQLException
	 { 
		
		 System.out.println("Enter id where you want to delete");
		 int id=sc.nextInt();
		 
			 pst = con.prepareStatement("delete from user1  where id=? ");
			 
	
			 pst.setInt(1,id);
			 pst.executeUpdate();
			 System.out.println("row deleted");
			
		
	 }
	 public void  display_data() throws SQLException
	 {
		 pst = con.prepareStatement("select * from user1");
		 ResultSet rs = pst.executeQuery();
		 while(rs.next())
		 {
			System.out.println("id="+rs.getInt("id"));
			System.out.println ("name="+rs.getString("ename"));
			System.out.println ("mail="+rs.getString("mail"));
			System.out.println ("salary="+rs.getDouble("sal"));
			System.out.println ("age="+rs.getInt("age"));
			System.out.println("___________________________");
			 
		 }
		
		 
	 }
	

}
