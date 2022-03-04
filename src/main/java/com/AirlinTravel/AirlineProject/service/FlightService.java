package com.AirlinTravel.AirlineProject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirlinTravel.AirlineProject.model.AirlineDetails;
import com.AirlinTravel.AirlineProject.model.FlightDetails;
import com.AirlinTravel.AirlineProject.repository.AirlineRepository;
import com.AirlinTravel.AirlineProject.repository.FlightRepository;



@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;	
	@Autowired
	private AirlineRepository AirlineRespository;
	
	public FlightDetails saveFlight(FlightDetails b) {
		
		return flightRepository.save(b);
		
	}
	
	public List<FlightDetails> getAllFlight() {
		List<FlightDetails> listofflights = flightRepository.findAll();
        List<FlightDetails> resultlist = new ArrayList<FlightDetails>();
        for (FlightDetails flightDetails : listofflights) {
            int airlineid = flightDetails.getAirlineId();
 
            Optional<AirlineDetails> airlinedetails = AirlineRespository.findById(airlineid);
            if (airlinedetails.isPresent()) {
            	
                if (!airlinedetails.get().getIsblocked())
                    resultlist.add(flightDetails);
            }
 
        }
        return resultlist;
	}
	
	public FlightDetails updateFlight(FlightDetails b) {
		if(flightRepository.existsById(b.getFlightNumber())) {
			return flightRepository.save(b); // save if id not found, edit where id is found 
		} else {
			throw new RuntimeException("Invalid flight id, update operation failed");
		}
	}
	
	public boolean deleteFlight(String FlightNumber) {
		boolean isFound = flightRepository.existsById(FlightNumber);
		flightRepository.deleteById(FlightNumber);
		return isFound;
	}

	public List<FlightDetails> flightsByCriteria(String fromPlace, String toPlace) {
		// TODO Auto-generated method stub
		return flightRepository.findByFromPlaceAndToPlace(fromPlace, toPlace);
	}
	
	/*
	 * public List<FlightDetails> flightsByCriteria(String from,String to){ return
	 * flightRepository.getFlightsBasedOnCriteria(from, to); }
	 */

}
