package com.jspyders.learningPST;

import java.sql.SQLException;
import java.util.Scanner;

public class UserDriver {
	public static void main(String[] args) throws SQLException {
		boolean flag=true;
		while(flag) {
		Scanner sc = new Scanner(System.in);
		UserRespiratory ur=new UserRespiratory();
		System.out.println("----------------------WELCOME-----------------------");
		System.out.println("press 1 for insert");
		System.out.println("press 2 for update");
		System.out.println("press 3 for delete");
		System.out.println("press 4 for display");
		System.out.println("enter 5 for exit");
		
		System.out.println("Enter the choice: ");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1: ur.insert_data();
		            break;
		case 2: ur.update_data();
		          break;
		case 3: ur.delete_data();
                   break;
        case 4: ur.display_data();
                 break;
        case 5:
        	System.out.println("enter 1 for exit");
        	int choice1=sc.nextInt();
        	if(choice1==1)
        	{
        		flag=false;
        		break;
        	}
        	
        	
		}
		System.out.println("Thank you visit again");
	}
	}
}
