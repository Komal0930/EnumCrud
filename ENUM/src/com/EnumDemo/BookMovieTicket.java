package com.EnumDemo;

import java.util.Scanner;

public class BookMovieTicket {

static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the seat type.");
		System.out.println("1. Standard  2. Premium  3. Recliner");
		int seattype=sc.nextInt();
		System.out.println("Enter number of seats you want to book..");
		int no=sc.nextInt();
		MovieTicket ms=null;
		switch(seattype)
		{
		case 1: ms=MovieTicket.STANDARD;
		break;
		case 2 : ms=MovieTicket.PREMIUM;
		break;
		case 3 : ms=MovieTicket.RECLINER;
		break;
		default: System.out.println("Error....");
		}
		System.out.println("Total price of  "+no+" tickets of  type  "+ms+" is "+(no*ms.price));

	}

}
