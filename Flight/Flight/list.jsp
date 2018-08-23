<%@page import="com.rohan.dao.DAOFactory"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.rohan.bean.Flight"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%
	ArrayList <Flight> flight_list;
	Flight flight;
	Iterator<Flight> itr;
	
	DAOFactory dao = DAOFactory.getDao();
	flight_list = dao.allFlight("DEL","BOM");
	itr = flight_list.iterator();	
%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<div>
            <form name="form" action="" method="post">
              <table>
                <thead>
                <tr>
                  <th>Image</th>
                  <th>Name</th>
                  <th>Depart Time</th>
                  <th>Arrival Time</th>
                  <th>Duration</th>
                  <th>Price</th>
                  <th>Book</th>
                </tr>
                </thead>
                <tbody>
                <% while(itr.hasNext())
                {
                	flight = itr.next();
                
                %>
                <tr>
                  <td><%= flight.getFlight_image() %></td>
                  <td><%= flight.getFlight_code() %>  </td>
                  <td><%= flight.getDeparture_time() %></td>
                  <td><%= flight.getArrival_time() %></td>
                  <td><%= flight.getDuration() %></td>
                  <td><%= flight.getPrice() %></td>
                  
                  <td><input type="button" onclick="alert('<%=flight.getId() %> edit')" value="Edit" />
                  </td>
                </tr>
                <%} %>
                </tbody>
              </table>
              </form>
            </div>
            
</body>
</html>