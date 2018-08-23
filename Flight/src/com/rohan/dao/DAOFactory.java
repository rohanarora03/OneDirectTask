package com.rohan.dao;

import java.util.ArrayList;

import com.rohan.bean.Flight;
import com.rohan.bean.master_airport;

public abstract class DAOFactory 
{
	public static DAOFactory getDao()
	{
		DAOFactory dao = new SqlDAO();
		return dao;
	}
	
	public abstract ArrayList <master_airport> getAll();
	public abstract ArrayList<Flight> allFlight(String src_code, String dest_code);
}
