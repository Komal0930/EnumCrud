package com.BasicJava;

import java.util.Arrays;

public class Q6SecondMostFrequentElement {
	public static void secondFrequent(String s)
	{
		char ch[]=s.toCharArray();
		int c=0;
		int max=0;
		int semax=0;
		char arr[]=new char[6];
		
		for (int i=0;i<ch.length;i++)
		{
			c=1;
			boolean isvisited=false;
			for (int k=i-1;k>=0;k--)
			{
				if (ch[k]==ch[i])
				{
					isvisited=true;
					break;
				}
			}
			if (isvisited==false)
			{
				for (int j=i+1;j<ch.length;j++)
				{
					if (ch[i]==ch[j])
					{
						c++;
						
					}
				}	
				
			}
			if (c>1)
			{
				
				
			}
			
			
			
		}
			
		
		
	}

	public static void main(String[] args) {
		String s="success";
		System.out.println("Original String :"+s);
		secondFrequent(s);
	}

}
