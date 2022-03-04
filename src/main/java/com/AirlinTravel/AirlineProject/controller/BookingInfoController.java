package com.AirlinTravel.AirlineProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AirlinTravel.AirlineProject.model.BookingDetails;
import com.AirlinTravel.AirlineProject.model.PassengerDetails2DB;
import com.AirlinTravel.AirlineProject.service.PassengerDetails2DBService;

@RestController
public class BookingInfoController {
	@Autowired
	private PassengerDetails2DBService bookinginfoservice;
	@PostMapping("/api/v1.0/flight/booking/{flightid}")
	public String bookflight(@RequestBody BookingDetails b, @PathVariable String flightid) {
		System.out.println("-------------------------in controller1"+b.toString());
		b.setFlightid(flightid);
		System.out.println("-------------------------in controller2"+b.toString());
		return bookinginfoservice.saveFlight(b);
		
	}
	@GetMapping("/api/v1.0/flight/ticket/{pnr}")
    public PassengerDetails2DB[] getflight(@PathVariable long pnr) {

 

        return bookinginfoservice.getbookingdetails(pnr);
    }

 

    @GetMapping("/api/v1.0/flight/booking/history/{emailId}")
    public PassengerDetails2DB[] getemailtofilter(@PathVariable String emailId) {

 

        return bookinginfoservice.getbookingdetailsmail(emailId);
    }
	
	


}
