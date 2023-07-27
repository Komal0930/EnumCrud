package com.jdbcConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
static Connection conn=null; // interface 

public static Connection getConnect()
{
	try
	{
		// load the driver
		// we need to create object of Driver class
		// but we dont know the class name
		// return class class return of java.lang
		// static name for name
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded.............");
		
		// Driver Connection
		// DriverManager=class, getConnection :Static method
		// url: mysql : protocol,set of rules
		// localhost: current pc
		// 3306 : port number of sql
		// showroom : database name in sql
		conn=DriverManager.getConnection("jdbc:mysql://localhost :3306/showroom", "root", "root");
		System.out.println("Connection established.......");
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return conn;
}

public static void main(String[] args)
{
	getConnect();
}
}
