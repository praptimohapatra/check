package pkg1;

import java.io.*;
import java.util.*;
abstract class Stack {
	abstract void push();
	abstract void pop();

}
class Instack extends Stack
{
	Instack()
	{
		
	}
	
	public void push()
	{
		System.out.println(10);
	}
	public void pop()
	{
		
	}
}
class Charstack extends Stack
{
	public void push()
	{
		
	}
	public void pop()
	{
		
	}
	public static void main(String[] args)
	{
		Charstack ck=new Charstack();
		Instack ik=new Instack();
		
		//ik.push(10);
		//ik.push(20);
		//ik.push(30);
		System.out.println(ik);
		
	}
}
