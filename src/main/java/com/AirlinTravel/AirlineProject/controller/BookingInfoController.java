package com.AirlinTravel.AirlineProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AirlinTravel.AirlineProject.model.BookingDetails;
import com.AirlinTravel.AirlineProject.model.PassengerDetailsInfo;
import com.AirlinTravel.AirlineProject.service.PassengerDetails2DBService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/flight")
public class BookingInfoController {
	@Autowired
	private PassengerDetails2DBService bookinginfoservice;

	@PostMapping("/api/v1.0/flight/booking")
	public PassengerDetailsInfo bookflight(@RequestBody BookingDetails b) {

		return bookinginfoservice.saveFlight(b);

	}

	@GetMapping("/api/v1.0/flight/ticket/history")
	public List<PassengerDetailsInfo> getflight() {

		return bookinginfoservice.getbookinghistory();
	}

	@GetMapping("/api/v1.0/flight/ticket/{pnr}")
	public PassengerDetailsInfo[] getflight(@PathVariable long pnr) {

		return bookinginfoservice.getbookingdetails(pnr);
	}

	@GetMapping("/api/v1.0/flight/booking/history/{emailId}")
	public PassengerDetailsInfo[] getemailtofilter(@PathVariable String emailId) {

		return bookinginfoservice.getbookingdetailsmail(emailId);
	}

}
