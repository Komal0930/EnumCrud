package com.jdConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchDataFromSQL {

	static Connection cann=null;
	Statement st;
	ResultSet rs;
	public FetchDataFromSQL()
	{
		cann=DBConnect.getConnect();
		System.out.println("Connection done............");
		try
		{
			st=cann.createStatement();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void fetchModel()
	{
		try
		{
			rs=st.executeQuery("select*from model");
			System.out.println(".......................................................");
			System.out.println("Model Id"+"   "+"Model Name"+"          "+"cost");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"         "+rs.getString(2)+"           "+rs.getInt(3));
			}
			System.out.println(".......................................................");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void fetchCustomer()
	{
		try
		{
			rs=st.executeQuery("select*from customer");
			System.out.println("...........................................");
			System.out.println("..............Customer..................");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"    "+rs.getString(3)+"   "+rs.getString(4)
				+"     "+rs.getString(5)+"     "+rs.getString(6));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void getPurchase()
	{
		try
		{
			rs=st.executeQuery("select p.Purchase_id,c.first_name, c.last_name, m.model_name,pm.payment_type, fr.rating\r\n" + 
					"from purchase p join customer c join model m join payment_mode pm join feedback_rating fr\r\n" + 
					"on p.cid=c.cust_id and p.mid=m.model_id and p.payment_id=pm.pid and p.r_id=fr.rating_id;");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "
						+rs.getString(4)+"  "+rs.getString(5)+" "+rs.getString(6));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		FetchDataFromSQL f=new FetchDataFromSQL();
		//f.fetchModel();
		//f.fetchCustomer();
		f.getPurchase();

	}

}
