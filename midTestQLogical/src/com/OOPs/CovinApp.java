package com.OOPs;
import java.time.zone.*;
import java.time.temporal.*;
import java.util.Scanner;

public class CovinApp {

	public static void main(String[] args) {
		Q8CovinAppInfo a=new Q8CovinAppInfo();
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Welcome for booking covaccin slot..");
		System.out.println("Have you taken first vaccine");
		char choice=sc.next().charAt(0);
	    if (choice=='Y'||choice=='y')
	    {
	    	System.out.println("Enter date of 1st vaccine");
	    	int date=sc.nextInt();
	    	System.out.println("Enter todays date.");
	    	int today=sc.nextInt();
	    	
	    	try
	    	{
	    		a.date(date, today);
	    	}
	    	catch(DaysNotCompleteException d)
	    	{
	    		System.out.println(d.getMessage());
	    	}
	    	finally
	    	{
	    		System.out.println("Visit again..");
	    	}
	    }
	    else
	    {
	    	try
	    	{
	    		a.bookSlot(choice);
	    	}
	    	catch(FirstVaccineTaken f)
	    	{
	    		System.out.println(f.getMessage());
	    	}
	    	finally
	    	{
	    		System.out.println("visit again..");
	    	}
	    }
	}
	

}
