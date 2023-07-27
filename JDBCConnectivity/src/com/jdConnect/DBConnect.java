package com.jdConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost :3306/showroom";
	public static final String USERNAME="root";
	
	public static final String PASSWORD="root";
	 static Connection cann=null;
	 public static Connection getConnect()
	 {
		 try
		 {
			 Class.forName(JDBC_DRIVER);
			 System.out.println("Driver loaded..........");
			 cann=DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
				System.out.println("Connection established.......");
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 return cann;
	 }
	
	
	
	
}
