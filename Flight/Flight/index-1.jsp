//Main Flight Search Page

<%@page import="java.util.Iterator"%>
<%@page import="com.rohan.dao.DAOFactory"%>
<%@page import="com.rohan.bean.master_airport"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%
	ArrayList <master_airport> city_list;
	master_airport src_city, dest_city;
	Iterator <master_airport> src_itr, dest_itr;
	
	DAOFactory dao = DAOFactory.getDao();
	city_list = dao.getAll();
	src_itr = city_list.iterator();
	dest_itr = city_list.iterator();
%>

<!DOCTYPE html>
<head>
<title>Index</title>
</head>
<body>
<div>

//Dropdown list for source cities
<label>From</label>
<select name="src_name">
<option value="">-Select Category	-</option>
  <%while(src_itr.hasNext())
{
	src_city = src_itr.next();
%>
<option value="<%=src_city.getId()%>">
<%=src_city.getCity_name() %> (<%=src_city.getAirport_code() %>)
</option>
<%} %>
</select>
</div>

//Dropdown list for destination cities
<div>
<label>To</label>
<select name="dest_name">
<option value="">-Select Category	-</option>
  <%while(dest_itr.hasNext())
{
	dest_city = dest_itr.next();
%>
<option value="<%=dest_city.getId()%>">
<%=dest_city.getCity_name() %> (<%=dest_city.getAirport_code() %>)
</option>
<%} %>
</select>
</div>

<div>
  <label>Departure Date</label>
  <input type="date" name="dept_date" placeholder="Enter Date of Departure" value="2018-08-24">
</div>

<div>
  <label>Passengers</label>
  <input type="text" name="seat_count" placeholder="Enter No. of Passengers">
</div>                             

<div>
  <button type="submit">Search</button>
</div>
              
</body>
</html>
