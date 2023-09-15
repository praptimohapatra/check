package com.jspyder;

public class ExecutionSteps1 {
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Registration is done");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
