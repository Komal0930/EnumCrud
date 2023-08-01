package com.EnumDemo;

public enum MovieTicket {
	
	STANDARD(300), PREMIUM(400), RECLINER(600);
	int price;
	MovieTicket(int price)
	{
		this.price=price;
	}

}
