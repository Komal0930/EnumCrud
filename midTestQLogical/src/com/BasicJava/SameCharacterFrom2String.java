package com.BasicJava;

import java.util.Arrays;

public class SameCharacterFrom2String {
	public void sameCharacter(String s1, String s2)
	{
		s1=s1.concat(s2);
		s1=s1.toLowerCase();
		s1=s1.replaceAll(" ", "");
		char ch[]=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		String e="";
		int count=1;
		for (int i=0;i<ch.length;i++)
		{
			count=1;
			boolean isvisited=false;
			for (int k=i-1;k>=0;k--)
			{
				if (ch[i]==ch[k])
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
						count++;
					}
				}
				
			}
			if (count>1)
			{
				e=e+ch[i];
			}
		}
		char sort[]=e.toCharArray();
		for (int i=0;i<sort.length;i++)
		{
			for (int j=i+1;j<sort.length;j++)
			{
				if (sort[i]>sort[j])
				{
					char temp='0';
					temp=sort[i];
					sort[i]=sort[j];
					sort[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(sort));
		
		
	}

	public static void main(String[] args) {
		String s1="Thin Stickes";
		String s2="Thick Bricks";
		
		SameCharacterFrom2String s=new SameCharacterFrom2String();
		s.sameCharacter(s1, s2);

	}

}
