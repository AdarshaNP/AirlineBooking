package com.AirlinTravel.AirlineProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AirlinTravel.AirlineProject.model.AirlineDetails;
import com.AirlinTravel.AirlineProject.model.FlightDetails;
import com.AirlinTravel.AirlineProject.service.AirlineService;

@RestController
public class AirlineController {
	
	@Autowired
	AirlineService airlineService;
	
	
	@GetMapping("/airline/getAllAirlines")
	public List<AirlineDetails> getAll() {
		return airlineService.getAll();
	}
	
	
	@PostMapping("/airline/add")
	public List<AirlineDetails> save(@RequestBody List<AirlineDetails> details)
	{
		return airlineService.save(details);
	}
	
	@GetMapping("/airline/block/{airline_id}")
	public String blockId(@PathVariable int airline_id) {
		return airlineService.blockID(airline_id);
	}
	

	
}
