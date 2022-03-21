package com.AirlinTravel.AirlineProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PassengerDetailsInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	// private String gender;
	// private int age;
	private int seatnumber;
	// private String meal;
	private long pnr;
	private String email;
	private int flightnumber;

	public PassengerDetailsInfo() {

	}

	public PassengerDetailsInfo(int id, String name, int seatnumber, long pnr, String email, int flightnumber) {
		super();
		this.id = id;
		this.name = name;
		this.seatnumber = seatnumber;
		this.pnr = pnr;
		this.email = email;
		this.flightnumber = flightnumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public long getPnr() {
		return pnr;
	}

	public void setPnr(long pnr) {
		this.pnr = pnr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(int flightnumber) {
		this.flightnumber = flightnumber;
	}

}
