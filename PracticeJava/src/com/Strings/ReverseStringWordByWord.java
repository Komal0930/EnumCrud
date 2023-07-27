package com.Strings;

import java.util.Scanner;

public class ReverseStringWordByWord {
	public static void reverse(String s)
	{
		System.out.println("Original String : "+s);
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
		System.out.println("Reverse String : "+rev);
		
		
		
	}

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String");
      String s=sc.nextLine();
      reverse(s);
	}
   
}
