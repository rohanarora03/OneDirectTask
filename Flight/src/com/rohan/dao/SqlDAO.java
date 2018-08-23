package com.rohan.dao;
import com.rohan.bean.Flight;
import com.rohan.bean.master_airport;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SqlDAO extends DAOFactory{

	Connection con;
	Statement st;
	ResultSet rs;
	String query,name="";
	int i;
	boolean flag=false;

	ArrayList<master_airport> city_list;
	master_airport city;
	
	ArrayList<Flight> flight_list;
	Flight flight;
	
	@Override
	public ArrayList<master_airport> getAll() {
		city_list = new ArrayList<master_airport>();
		try {
			con=DBConnection.getConnection();
			st=con.createStatement();
			query="select * from master_airport order by city_name";
			rs = st.executeQuery(query);

			while(rs.next())
			{
				city = new master_airport();
				city.setId(rs.getInt("id"));
				city.setCity_name(rs.getString("city_name"));
				city.setAirport_code(rs.getString("airport_code"));
				
				city_list.add(city);
			}
			con.close();
			st.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return city_list;
	}
	
	@Override
	public ArrayList<Flight> allFlight(String src_code, String dest_code) {
		flight_list=new ArrayList<Flight>();
		try{
			con=DBConnection.getConnection();
			st=con.createStatement();
			query="select * from flight_listing WHERE src_code ='"+src_code+"'and dest_code='"+dest_code+"'";
			rs=st.executeQuery(query);
			while(rs.next())
			{
				flight=new Flight();
				flight.setId(rs.getInt("id"));
				flight.setFlight_image(rs.getString("flight_image"));
				flight.setFlight_code(rs.getString("flight_code"));
				flight.setDeparture_time(rs.getString("departure_time"));
				flight.setArrival_time(rs.getString("arrival_time"));
				flight.setDuration(rs.getInt("duration"));
				flight.setPrice(rs.getInt("price"));
				
				flight_list.add(flight);				
			}
			con.close();
			st.close();
			rs.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return flight_list;
	}

	
}


