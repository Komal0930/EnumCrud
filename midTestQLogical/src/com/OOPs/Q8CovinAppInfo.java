package com.OOPs;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class FirstVaccineTaken extends RuntimeException
{
	public FirstVaccineTaken()
	{
		super();
	}
	public FirstVaccineTaken(String msg)
	{
		super(msg);
	}
}
class DaysNotCompleteException extends RuntimeException
{
	public DaysNotCompleteException()
	{
		super();
	}
	public DaysNotCompleteException(String msg)
	{
		super(msg);
	}
}
public class Q8CovinAppInfo {
	public void bookSlot(char choice)
	{
		
		if (choice!='Y'||choice!='y')
		{
			throw new FirstVaccineTaken("you have not taken 1st vaccine. you are not eligible for 2nd vaccine");
		}
		
		
	}
	public void date(int date, int today)
	{
		int daysafter1stvaccine=today-date;
		int days=(int) (TimeUnit.MILLISECONDS.toDays(daysafter1stvaccine)%365);
		System.out.println(days);
		if(days<60)
		{
			throw new DaysNotCompleteException("Days not complete...");
		}
		else
		{
			System.out.println("Your booking is confirm..");
		}
		
	}

	public static void main(String[] args) {
		

	}

}
