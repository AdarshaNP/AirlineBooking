package com.AirlinTravel.AirlineProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AirlinTravel.AirlineProject.Exception.InvalidAirlineIdException;
import com.AirlinTravel.AirlineProject.model.FlightDetails;
import com.AirlinTravel.AirlineProject.service.FlightService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/flight")

public class FlightController {

	/*
	 * public FlightController(FlightService flightService) { super();
	 * this.flightService = flightService; }
	 */

	@Autowired
	private FlightService flightService;

	/*
	 * @GetMapping("/secure") public String check() { return "secured"; }
	 */

	@PostMapping("/api/v1.0/flight/airline/inventory/add")
	public String register(@RequestBody List<FlightDetails> ud) throws InvalidAirlineIdException {
		for (FlightDetails flightDetails : ud) {
			flightService.saveFlight(flightDetails);
		}

		return "Data Added successfully";
	}

	/*
	 * @PostMapping("/api/v1.0/flight/airline/inventory/add") public String
	 * register(@RequestBody FlightDetails ud) { flightService.saveFlight(ud);
	 * 
	 * return "Registered Successfully"; }
	 */

	@GetMapping("/api/v1.0/flight/airline/inventory/getflights")
	public List<FlightDetails> getAllRegisteredUsers() {
		return flightService.getAllFlight();
	}

	@PostMapping("/api/v1.0/flight/airline/inventory/searchflights")
	public FlightDetails searchFlightDetails(@RequestBody FlightDetails ud) {
		// it should the return the list of the flights
		// params are toPlace,fromPlace,EndDate,StartDate

		// List<FlightDetails> fDetails =

		return ud;

	}

	@PutMapping("/api/v1.0/flight/airline/inventory/updateflights")
	public String updateFlightDetails(@RequestBody List<FlightDetails> ud) {
		for (FlightDetails flightDetails : ud) {
			flightService.updateFlight(flightDetails);
		}

		return "updated successfully";
	}

	@DeleteMapping("/api/v1.0/flight/airline/inventory/deleteflights/{flightId}")
	public boolean updateFlightDetails(@PathVariable String flightId) {
		return flightService.deleteFlight(flightId);
	}

	/*
	 * @GetMapping("airline/inventory/searchCriteria/{fromPlace}/{toPlace}") public
	 * List<FlightDetails> searchCriteria(@PathVariable String
	 * fromPlace,@PathVariable String toPlace){ return
	 * flightService.flightsByCriteria(fromPlace, toPlace); }
	 */

	@GetMapping("airline/inventory/searchCriteria/{fromPlace}/{toPlace}")
	public List<FlightDetails> searchCriteria(@PathVariable String fromPlace, @PathVariable String toPlace) {
		return flightService.flightsByCriteria(fromPlace, toPlace);
	}

	/*
	 * @GetMapping("airline/inventory/searchCriteria/{fromPlace}/{toPlace}") String
	 * searchCriteria(@PathVariable String fromPlace, @PathVariable String toPlace)
	 * { return fromPlace + toPlace; }
	 */

}
