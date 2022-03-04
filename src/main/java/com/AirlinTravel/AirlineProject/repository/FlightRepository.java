package com.AirlinTravel.AirlineProject.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.AirlinTravel.AirlineProject.model.FlightDetails;



public interface FlightRepository extends JpaRepository<FlightDetails, String> {
	List<FlightDetails> findByFromPlaceAndToPlace(String a ,String b);
	

	//@Query("select FlightDetails from FlightDetails where fromPlace = :from and toPlace = :to")
	//List<FlightDetails> getFlightsBasedOnCriteria(@Param("from") String from, @Param("to") String to);
}

