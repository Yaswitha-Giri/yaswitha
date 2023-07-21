package com.yas;

public class Flight {
	private String id;
	private String source;
	private String destination;
	private double fare;
	private int totalseats;
	private int availableseats;
	private String arrivaltime;
	private String deptime;
	private String compname;
	
	public Flight () {}

	public Flight(String id, String source, String destination, double fare, int totalseats, int availableseats,
			String arrivaltime, String deptime, String compname) {
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.totalseats = totalseats;
		this.availableseats = availableseats;
		this.arrivaltime = arrivaltime;
		this.deptime = deptime;
		this.compname = compname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public int getTotalseats() {
		return totalseats;
	}

	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}

	public int getAvailableseats() {
		return availableseats;
	}

	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}

	public String getArrivaltime() {
		return arrivaltime;
	}

	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}

	public String getDeptime() {
		return deptime;
	}

	public void setDeptime(String deptime) {
		this.deptime = deptime;
	}

	public String getCompname() {
		return compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	
	
	

}
