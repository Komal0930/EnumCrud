package com.Strings;

import java.util.Scanner;

public class FirstAndLastWordRemainSame {
	public static void firstlastsame(String s)
	{
		String sarr[]=s.split(" ");
		String rev="";
		for (int i=0;i<sarr.length;i++)
		{
			if (sarr[i]!=sarr[0]&&sarr[i]!=sarr[sarr.length-1])
			{
			for (int j=sarr[i].length()-1;j>=0;j--)
			{
				rev=rev+sarr[i].charAt(j);
			}
			}
			else
			{
				rev=rev+sarr[i];
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		firstlastsame(s);

	}

}
