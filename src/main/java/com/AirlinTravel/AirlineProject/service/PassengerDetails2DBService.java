package com.AirlinTravel.AirlineProject.service;
import java.util.Arrays;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirlinTravel.AirlineProject.model.BookingDetails;
import com.AirlinTravel.AirlineProject.model.FlightDetails;
import com.AirlinTravel.AirlineProject.model.PassengerDetails;
import com.AirlinTravel.AirlineProject.model.PassengerDetails2DB;
import com.AirlinTravel.AirlineProject.repository.PassengerDetails2DBRepository;

@Service
public class PassengerDetails2DBService {
	@Autowired
	private PassengerDetails2DBRepository passengerDetails2DBRepository; 
	
	
	
public String saveFlight(BookingDetails b) {
	
	String email = b.getEmailid();
	String flightid = b.getFlightid();
	
	//int pnr = (int)UUID.randomUUID().getLeastSignificantBits();
	//UUID uuid = UUID.randomUUID();
    //return fastUUID(uuid.getLeastSignificantBits(), uuid.getMostSignificantBits());
	int pnr = (int)UUID.randomUUID().hashCode() & Integer.MAX_VALUE;
	//System.out.println (uniqueID);
	


	int length = b.getSeatnumbers().length;
	int[] seatnumbers = b.getSeatnumbers();
	PassengerDetails[] p= b.getPassengerdetails();
	for(int i=0;i<length;i++)
	{
		
		PassengerDetails2DB passengerDetails = new PassengerDetails2DB(p[i].getName(),p[i].getGender(),p[i].getAge(),seatnumbers[i],p[i].getMeal(),pnr,email,flightid);	
		passengerDetails2DBRepository.save(passengerDetails);
	}
	String s = "Flight has been booked successfully and your pnr number is: " + pnr;
		return s;
		
	}
public PassengerDetails2DB[] getbookingdetails(long pnr) {
    return passengerDetails2DBRepository.findByPnr(pnr);

}

public PassengerDetails2DB[] getbookingdetailsmail(String mail) {
    return passengerDetails2DBRepository.findByEmail(mail);
}

}
