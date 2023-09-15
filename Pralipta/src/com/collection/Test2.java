package com.collection;

import java.util.ArrayList;
public class Test2 {
          public static void main(String[] args)
          {
        	  ArrayList l=new ArrayList();
        	  l.add("aaa");
        	  l.add(10);
        	  l.add(true);
        	  System.out.println(l);
        	  System.out.println(l.contains("aaa"));
        	  System.out.println(l.contains("zzz"));
        	  
        	  ArrayList l1=new ArrayList();
        	  l1.add(111);
        	  l1.add(222);
        	  l1.add(333);
        	  System.out.println(l1);
        	  l1.addAll(l);
        	  System.out.println(l1.containsAll(l));
        	  
        	  System.out.println(l.isEmpty());
        	  //l.removeAll(l);
        	  //System.out.println(l);
        	  
        	  System.out.println(l.size());
        	  
        	  
          }
}
