package com.BasicJava;

import java.util.Scanner;

public class FascinatingNumber {
	public void fascinatingNo(int num)
	{
		int n2=num*2;
		int n3=num*3;
		
		String s1=Integer.toString(n2);
		String s2=Integer.toString(n3);
		String s3=Integer.toString(num);
		s1=s1.concat(s2);
		s3=s3.concat(s1);
		 System.out.println(s3);
	   
		
		boolean found=true;
		for (char c='1';c<='9';c++)
		{
			int count=0;
		
		for (int i=0;i<s3.length();i++)
		{
			char ch=s3.charAt(i);
			if(ch==c)
			{
				count++;
			}
		}
		if (count>1 || count==0)
		{
			found=false;
			break;
		}
		
		}
		if (found==true)
		{
			System.out.println("Fascinating Number");
		}
		else
		{
			System.out.println("Not");
		}
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		FascinatingNumber f=new FascinatingNumber();
		f.fascinatingNo(num);
		
		

	}

}
