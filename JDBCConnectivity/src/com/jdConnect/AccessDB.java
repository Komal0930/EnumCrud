package com.jdConnect;

import java.sql.Connection;

public class AccessDB {
	static Connection con=null;
	public AccessDB()
	{
		try
		{
			con=DBConnect.getConnect();
			System.out.println("Done...............");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessDB ac=new AccessDB();

	}

}
