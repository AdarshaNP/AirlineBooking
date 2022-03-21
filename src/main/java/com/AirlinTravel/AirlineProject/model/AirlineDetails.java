package com.AirlinTravel.AirlineProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AirlineDetails {
	@Id
	private int airlineNumber;

	@Column(nullable = false)
	private String airlineName;
	@Column(nullable = false)
	private boolean isBlocked;

	@Override
	public String toString() {
		return "AirlineDetails [airlineNumber=" + airlineNumber + ", airlineName=" + airlineName + ", isBlocked="
				+ isBlocked + "]";
	}

	public AirlineDetails() {
		super();
	}

	public AirlineDetails(int airlineNumber, String airlineName, boolean isblocked) {
		super();
		this.airlineNumber = airlineNumber;
		this.airlineName = airlineName;
		this.isBlocked = isblocked;
	}

	public int getAirlineNumber() {
		return airlineNumber;
	}

	public void setAirlineNumber(int airlineNumber) {
		this.airlineNumber = airlineNumber;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public boolean getIsblocked() {
		return isBlocked;
	}

	public void setIsblocked(boolean isblocked) {
		this.isBlocked = isblocked;
	}

}
