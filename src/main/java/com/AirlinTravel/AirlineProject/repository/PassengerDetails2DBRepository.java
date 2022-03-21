package com.AirlinTravel.AirlineProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirlinTravel.AirlineProject.model.PassengerDetailsInfo;

public interface PassengerDetails2DBRepository extends JpaRepository<PassengerDetailsInfo, Integer>{
	PassengerDetailsInfo[] findByPnr(long pnr);
    PassengerDetailsInfo[] findByEmail(String email);

}
