package com.rohan.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.rohan.constant.Constant;

public class DBConnection 
{
	public static Connection getConnection()
	{
		Connection con =null;
		try {
			Class.forName(Constant.DRIVER_NAME);
			con=DriverManager.getConnection(Constant.CONNECTION_STRING+Constant.DATABASE_NAME,Constant.USER_NAME,Constant.PASSWORD);     
			
		} catch (Exception e) 
		{
			System.out.println("connection not establish");
			e.printStackTrace();
		}
		return con;
	}
}
