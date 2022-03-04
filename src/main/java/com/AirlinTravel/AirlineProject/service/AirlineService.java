package com.AirlinTravel.AirlineProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirlinTravel.AirlineProject.model.AirlineDetails;
import com.AirlinTravel.AirlineProject.repository.AirlineRepository;

@Service
public class AirlineService {
	
	@Autowired
	AirlineRepository airlineRepository;
	
	
	public List<AirlineDetails> getAll(){
		return airlineRepository.findAll();
	}
	
	
	public List<AirlineDetails> save(List<AirlineDetails> airlineData){
		
		return airlineRepository.saveAll(airlineData);
	}


	public String blockID(Integer airline_id) {
		
		Optional<AirlineDetails> mydata= airlineRepository.findById(airline_id);
		
		if(mydata.isPresent()) {
			mydata.get().setIsblocked(true);
			airlineRepository.save(mydata.get());
		}else {
			return "ID Invalid";
		}
		
		return "Successfully Blocked";
		
	}

}
