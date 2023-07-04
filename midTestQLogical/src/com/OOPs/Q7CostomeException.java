package com.OOPs;

import java.util.Scanner;

class InvalidLengthException extends RuntimeException
{
	public InvalidLengthException()
	{
		super();
	}
	public  InvalidLengthException(String msg)
	{
		super(msg);
	}
}
class InvalidLetterException extends RuntimeException
{
	public InvalidLetterException()
	{
		super();
	}
	public  InvalidLetterException(String msg)
	{
		super(msg);
	}
}
public class Q7CostomeException {
	public void checkMobileLength (String str)
	{
		boolean isletter=false;
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i)>='a'&& str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				isletter=true;
				break;
			}
		}
		int len=str.length();
		if (isletter==true)
		{
			throw new InvalidLetterException("Mobile No does not contain any letter.");
		}
		else if (len>10||len<10)
		{
			throw new InvalidLengthException("Invalid length..");
		}
		
	}

	public static void main(String[] args) {
		Q7CostomeException d=new Q7CostomeException();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile no");
		String mobile=sc.next();
		try {
			d.checkMobileLength(mobile);
		}
		catch(InvalidLetterException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidLengthException l)
		{
			System.out.println(l.getMessage());
		}
		finally
		{
			System.out.println(" Thank you");
		}

	}

}
