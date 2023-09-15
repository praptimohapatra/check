package com.DEmo;

import jar_example.Book;
import jar_example.Employee;
public class TestJar {
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		emp.setEmp_id(1);
		emp.setSalary(235461);
		emp.setName("pralipta");
		emp.setAddress("Bhubaneswar");
		emp.setDepartment("developer");
		emp.setEmail("prapti@gmail.com");
		
		Book b=new Book();
		b.bookDetails();
	}

}
