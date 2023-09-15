package com.collection;

import java.util.ArrayList;
//object[] toArray()--> it converts collection to array
public class Test3 {
	public static void main(String[] args)
	{
		ArrayList l=new ArrayList();
		l.add("aaa");
		l.add(10);
		l.add(true);
		System.out.println("printin using for each loop");
		Object[] a=l.toArray();
		for(Object a1:a)
		{
		  System.out.println(a1);
		}
		System.out.println("==============================");
		System.out.println("printing using for loop");
		
		
	}

}
