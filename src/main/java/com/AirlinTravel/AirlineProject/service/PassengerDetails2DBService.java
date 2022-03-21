package com.AirlinTravel.AirlineProject.service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirlinTravel.AirlineProject.model.BookingDetails;
import com.AirlinTravel.AirlineProject.model.FlightDetails;
import com.AirlinTravel.AirlineProject.model.PassengerDetails;
import com.AirlinTravel.AirlineProject.model.PassengerDetailsInfo;
import com.AirlinTravel.AirlineProject.repository.PassengerDetails2DBRepository;

@Service
public class PassengerDetails2DBService {
	@Autowired
	private PassengerDetails2DBRepository passengerDetails2DBRepository;

	public PassengerDetailsInfo saveFlight(BookingDetails b) {

		String email = b.getEmailid();
		int flightid = b.getFlightid();

		// int pnr = (int)UUID.randomUUID().getLeastSignificantBits();
		// UUID uuid = UUID.randomUUID();
		// return fastUUID(uuid.getLeastSignificantBits(),
		// uuid.getMostSignificantBits());
		int pnr = (int) UUID.randomUUID().hashCode() & Integer.MAX_VALUE;
		// System.out.println (uniqueID);

		int length = b.getSeatnumbers().length;
		int[] seatnumbers = b.getSeatnumbers();
		/*
		 * PassengerDetails[] p= b.getPassengerdetails(); for(int i=0;i<length;i++) {
		 */

		PassengerDetailsInfo passengerDetails = new PassengerDetailsInfo(1, b.getName(), b.getSeats(), pnr, email,
				flightid);
		return 
		passengerDetails2DBRepository.save(passengerDetails);
		// }
		//String s = "Flight has been booked successfully and your pnr number is: " + pnr;
		//return s;

	}

	public PassengerDetailsInfo[] getbookingdetails(long pnr) {
		return passengerDetails2DBRepository.findByPnr(pnr);

	}

	public PassengerDetailsInfo[] getbookingdetailsmail(String mail) {
		return passengerDetails2DBRepository.findByEmail(mail);
	}

	public List<PassengerDetailsInfo> getbookinghistory() {
		// TODO Auto-generated method stub
		return passengerDetails2DBRepository.findAll();
	}

}
