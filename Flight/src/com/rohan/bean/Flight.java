package com.rohan.bean;

public class Flight {
	String flight_image, flight_code, flight_name, src_code, dest_code, departure_time, arrival_time;
	int id, price, duration;
	
	public String getFlight_code() {
		return flight_code;
	}
	public void setFlight_code(String flight_code) {
		this.flight_code = flight_code;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	public String getSrc_code() {
		return src_code;
	}
	public void setSrc_code(String src_code) {
		this.src_code = src_code;
	}
	public String getDest_code() {
		return dest_code;
	}
	public void setDest_code(String dest_code) {
		this.dest_code = dest_code;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getFlight_image() {
		return flight_image;
	}
	public void setFlight_image(String flight_image) {
		this.flight_image = flight_image;
	}
	
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
