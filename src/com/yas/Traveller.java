package com.yas;

import java.time.LocalDate;

public class Traveller {
	private String name;
	private int mobile;
	private String email;
	private static String flightId;
	private LocalDate date;
	
	public Traveller () {}

	public Traveller(String name, int mobile, String email, String flightId, LocalDate date)
	{
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.flightId = flightId;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	

}
