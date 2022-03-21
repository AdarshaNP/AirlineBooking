package com.AirlinTravel.AirlineProject.Exception;

public class InvalidAirlineIdException extends Exception{
	public InvalidAirlineIdException()
    {
       
    }
    public InvalidAirlineIdException(String s) 
    {
    	super(s);
    //System.out.println("---------------------------" +s);
       
    
    }

}
