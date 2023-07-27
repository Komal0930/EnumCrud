package com.jdConnect;
import java.sql.*;
import java.util.Scanner;
public class PreparedStatement1 {
	static Connection con=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc=new Scanner(System.in);
	public PreparedStatement1()
	{
		con=DBConnect.getConnect();
		
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			
			System.out.println(e);
		}
		
	}
	
	public void insertModel()
	{
		System.out.println("Enter model ID");
		int mid=sc.nextInt();
		
		System.out.println("Enter Model name");
		String mname=sc.next();
		
		System.out.println("Enter model cost");
		int cost=sc.nextInt();
		
		try
		{
			pst=con.prepareStatement("insert into model values (?,?,?)");
			pst.setInt(1, mid);
			pst.setString(2, mname);
			pst.setInt(3, cost);
			
			int noOfRowsInserted=pst.executeUpdate();
			if (noOfRowsInserted>0)
			{
				System.out.println("Model is added.....");
			}
			else
			{
				System.out.println("error......");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	// using static --> statements
	public void deleteModel()
	{
		System.out.println("Enter model id");
		int mid=sc.nextInt();
		try
		{
			int noOfRowsDeleted=st.executeUpdate("delete from model where model_id='"+mid+"'");
			
			if (noOfRowsDeleted>0)
			{
				System.out.println("Model Deleted...");
			}
			else
			{
				System.out.println("Model Not found....");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	// using Dymanic query --> Prepared Statement
	public void deleteModel1()
	{
		System.out.println("Enter model id");
		int mid=sc.nextInt();
		
		try
		{
			pst=con.prepareStatement("delete from model where model_id=?");
			pst.setInt(1, mid);
			int noOfRowsDeleted=pst.executeUpdate();
			if(noOfRowsDeleted>0)
			{
				System.out.println("Model deleted...");
			}
			else
			{
				System.out.println("Model not found....");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	// Dynamic -->preparedStatement
	public void updateModel()
	{
		System.out.println("Enter model id");
		int mid=sc.nextInt();
		System.out.println("Enter new cost");
		int mcost=sc.nextInt();
		try
		{
			pst=con.prepareStatement("update model set cost=? where model_id=?");
			pst.setInt(1, mcost);
			pst.setInt(2, mid);
			int noOfRowsUpdated=pst.executeUpdate();
			if (noOfRowsUpdated>0)
			{
				System.out.println("Cost updated");
			}
			else
			{
				System.out.println("model not found");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreparedStatement1 pl=new PreparedStatement1();
		//pl.insertModel();
		//pl.deleteModel();
		//pl.deleteModel1();
		pl.updateModel();
	}

}
