package com.AirlinTravel.AirlineProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirlinTravel.AirlineProject.model.AirlineDetails;

public interface AirlineRepository extends JpaRepository<AirlineDetails, Integer> {

}
