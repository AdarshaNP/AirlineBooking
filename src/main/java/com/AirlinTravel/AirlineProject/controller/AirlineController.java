package com.AirlinTravel.AirlineProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AirlinTravel.AirlineProject.Exception.InvalidAirlineIdException;
import com.AirlinTravel.AirlineProject.model.AirlineDetails;
import com.AirlinTravel.AirlineProject.model.FlightDetails;
import com.AirlinTravel.AirlineProject.service.AirlineService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/flight")

public class AirlineController {

	@Autowired
	AirlineService airlineService;

	@GetMapping("/airline/getAllAirlines")
	public List<AirlineDetails> getAll() {
		//System.err.println("---------------------------" + airlineService.getAll().toString());
		return airlineService.getAll();
	}

	@PostMapping("/airline/add")
	public AirlineDetails save(@RequestBody AirlineDetails details) {
		// System.out.println("-----details-----" + details);
		return airlineService.save(details);
	}

	@GetMapping("/airline/block/{airline_id}")
	public boolean blockId(@PathVariable int airline_id) {
		airlineService.blockID(airline_id);
		return true;
	}

	@GetMapping("/airline/unblock/{airline_id}")
	public void unBlockId(@PathVariable int airline_id) throws InvalidAirlineIdException {
		airlineService.unBlockID(airline_id);
	}

	@DeleteMapping("/airline/delete/{airline_id}")
	public void deleteId(@PathVariable int airline_id) throws InvalidAirlineIdException {
		airlineService.deleteID(airline_id);
	}

	@GetMapping("/login/{username}/{password}")
	public String login(@PathVariable String username, @PathVariable String password) {

		return username;

	}

}
