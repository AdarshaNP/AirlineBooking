package com.AirlinTravel.AirlineProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirlinTravel.AirlineProject.model.User;



//Need to implement the save method.....
public interface UserRepository extends JpaRepository<User, String> {

	}



