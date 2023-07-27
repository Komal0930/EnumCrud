package com.Strings;

import java.util.Scanner;

public class ReverseString {
	public static void reverse(String s)
	{
		char ch;
		String rev="";
		for (int i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}
	public static void reverseWord(String s)
	{
		System.out.println("..................................");
		String sarr[]=s.split(" ");
		String rev="";
		for (int i=0;i<sarr.length;i++)
		{
			for (int j=sarr[i].length()-1;j>=0;j--)
			{
				rev=rev+sarr[i].charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println( rev);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		reverse(s);
reverseWord(s);
	}

}
