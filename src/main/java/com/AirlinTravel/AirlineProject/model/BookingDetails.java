package com.AirlinTravel.AirlineProject.model;

import java.util.Arrays;

public class BookingDetails {
	private String name;
	private String emailid;
	private int seats;
	private int seatnumbers[];
	// private PassengerDetails passengerdetails[];
	private int flightid;

	public BookingDetails() {

		// TODO Auto-generated constructor stub
	}

	public BookingDetails(String name, String emailid, int seats, int seatnumbers[], int flightid) {

		this.flightid = flightid;
		this.name = name;
		this.emailid = emailid;
		this.seats = seats;
		this.seatnumbers = seatnumbers;
		// this.passengerdetails = passengerdetails;
	}

	public int getFlightid() {
		return flightid;
	}

	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int[] getSeatnumbers() {
		return seatnumbers;
	}

	public void setSeatnumbers(int seatnumbers[]) {
		this.seatnumbers = seatnumbers;
	}

	// public PassengerDetails[] getPassengerdetails() {
	// return passengerdetails;
	// }

	/*
	 * public void setPassengerdetails(PassengerDetails[] passengerdetails) {
	 * this.passengerdetails = passengerdetails;
	 */
	// }

	@Override
	public String toString() {
		return "BookingInfo [name=" + name + ", emailid=" + emailid + ", seats=" + seats + ", seatnumbers="
				+ Arrays.toString(seatnumbers) + ", flightid=" + flightid + "]";
	}

}
