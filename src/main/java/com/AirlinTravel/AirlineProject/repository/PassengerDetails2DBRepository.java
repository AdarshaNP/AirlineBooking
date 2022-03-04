package com.AirlinTravel.AirlineProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirlinTravel.AirlineProject.model.PassengerDetails2DB;

public interface PassengerDetails2DBRepository extends JpaRepository<PassengerDetails2DB, Integer>{
	PassengerDetails2DB[] findByPnr(long pnr);
    PassengerDetails2DB[] findByEmail(String email);

}
