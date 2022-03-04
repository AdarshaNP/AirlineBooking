package com.AirlinTravel.AirlineProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PassengerDetails2DB {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private int age;
	private int seatnumber;
	private String meal;
	private long pnr;
	private String email;
	private String flightnumber;
	
	public PassengerDetails2DB()
	{
		
	}
	
	
	public PassengerDetails2DB(String name, String gender, int age, int seatnumber, String meal, long pnr,
			String email, String flightnumber) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.seatnumber = seatnumber;
		this.meal = meal;
		this.pnr = pnr;
		this.email = email;
		this.flightnumber = flightnumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
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
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	@Override
	public String toString() {
		return "StorePassengerDetails [name=" + name + ", gender=" + gender + ", age=" + age + ", seatnumber="
				+ seatnumber + ", meal=" + meal + ", pnr=" + pnr + ", email=" + email + ", flightnumber=" + flightnumber
				+ "]";
	}
	
}
