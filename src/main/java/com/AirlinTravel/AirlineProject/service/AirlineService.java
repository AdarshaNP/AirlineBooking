package com.AirlinTravel.AirlineProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirlinTravel.AirlineProject.Exception.InvalidAirlineIdException;
import com.AirlinTravel.AirlineProject.model.AirlineDetails;
import com.AirlinTravel.AirlineProject.repository.AirlineRepository;

@Service
public class AirlineService {

	@Autowired
	AirlineRepository airlineRepository;

	public List<AirlineDetails> getAll() {
		return airlineRepository.findAll();
	}

	public AirlineDetails save(AirlineDetails airlineData) {

		return airlineRepository.save(airlineData);
	}

	public String blockID(Integer airline_id) {

		Optional<AirlineDetails> mydata = airlineRepository.findById(airline_id);

		if (mydata.isPresent()) {
			mydata.get().setIsblocked(true);
			airlineRepository.save(mydata.get());
		} else {
			return "ID Invalid";
		}

		return "Successfully Blocked";

	}

	public void unBlockID(int airline_id) throws InvalidAirlineIdException {
		Optional<AirlineDetails> mydata = airlineRepository.findById(airline_id);

		if (mydata.isPresent()) {
			mydata.get().setIsblocked(false);
			airlineRepository.save(mydata.get());
		} else {
			throw new InvalidAirlineIdException("Invalid Airline ID");
		}

	}

	public void deleteID(int airline_id) throws InvalidAirlineIdException {
		Optional<AirlineDetails> mydata = airlineRepository.findById(airline_id);

		if (mydata.isPresent()) {
			airlineRepository.deleteById(airline_id);
		} else {
			throw new InvalidAirlineIdException("Invalid Airline ID");
		}

	}

}
