package com.AirlinTravel.AirlineProject.ErrorHandler;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.AirlinTravel.AirlineProject.Exception.InvalidAirlineIdException;
import com.AirlinTravel.AirlineProject.model.ExceptionMessage;

@ControllerAdvice
public class ErrorHandler {
	@ExceptionHandler(InvalidAirlineIdException.class)
	public ResponseEntity<?> handleException(Exception e) {
		// System.out.println("------------------ab--------");
		// return ResponseEntity.ok().body("something bad happened");

		return ResponseEntity.ok().body(new ExceptionMessage(e.getMessage(), e, LocalDateTime.now()));
	}

}
