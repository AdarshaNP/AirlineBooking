package com.AirlinTravel.AirlineProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {
	@Id
	private String name;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private long phonenumber;
	@Column(nullable = false)
	private String password;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserEntity() {} 
	
	
	public UserEntity(String name, String email, long phonenumber, String password) {
		
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "UserRegisteration [name=" + name + ", email=" + email + ", phonenumber=" + phonenumber + ", password="
				+ password + "]";
	}
	

	
	

}
