package com.collection;

import java.util.ArrayList;

public class Test1 {
         public static void main(String[] args)
         {
        	 ArrayList l=new ArrayList();
        	 l.add("prapti");
        	 l.add("min ho");
        	 l.add(10);
        	 l.add('z');
        	 l.add(10.5);
        	 System.out.println(l);
        	 
        	 ArrayList l1=new ArrayList();
        	 l1.add(true);
        	 l1.add(false);
        	 l1.add("Zindegi Guljar Hai");
        	// System.out.println(l1);
        	 l1.addAll(l);
        	 System.out.println(l1);
        	 l1.add("Zeeshan");
        	 l1.add("Pralipta");
        	 System.out.println(l1);
        	 //l1.remove(false);
        	 //System.out.println(l1);
        	//l1.removeAll(l);
        	//System.out.println(l1);
        	 l1.retainAll(l);
        	 System.out.println(l1);
         }
         
}
