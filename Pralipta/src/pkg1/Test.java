package pkg1;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		int len=s.length();
		int vow=0;
		int cou=0;
		
		for(int i=0; i<len; i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vow++;
			}
			else
			{
				cou++;
			}
		}
		System.out.println("num of vowel are "+vow);
		System.out.println("num of consonant are "+cou);
	}
}
