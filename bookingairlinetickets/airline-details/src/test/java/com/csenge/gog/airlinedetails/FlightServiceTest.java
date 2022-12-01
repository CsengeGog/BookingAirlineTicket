package com.csenge.gog.airlinedetails;

import com.csenge.gog.airlinedetails.entity.Airline;
import com.csenge.gog.airlinedetails.entity.Flight;
import com.csenge.gog.airlinedetails.service.FlightService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class FlightServiceTest {

    FlightService flightService;
    Flight flight1;
    Flight flight2;
    Airline airline1;



    @BeforeEach
    public void initialize() {
        flightService = new FlightService();
        airline1 = new Airline();
        airline1.setAirlineName("WizzAir");

        flight1 = new Flight();
        flight1.setAirlineName(airline1);
        flight1.setFlightNumber(12345);
        flight1.setDepartureTime(LocalDate.now());
        flight1.setLayovers(2);
        flight1.setTransitTime(LocalDate.now());
        flight1.setLuggage(true);
        flight1.setPrice(40);
        flight1.setOrigin("Budapest");
        flight1.setDestination("Seville");

        flight2 = new Flight();
        flight2.setAirlineName(airline1);
        flight2.setFlightNumber(12345);
        flight2.setDepartureTime(LocalDate.now());
        flight2.setLayovers(2);
        flight2.setTransitTime(LocalDate.now());
        flight2.setLuggage(false);
        flight2.setPrice(40);
        flight2.setOrigin("Rome");
        flight2.setDestination("Lisboa");
    }

    @Test
    public void getOrigins_WhenCalled_GetAllOrigins(){

        var origins = flightService.getOrigins();
        assertTrue(origins.size() != 0);
    }

    @Test
    public void getDestinationsByOrigin_OriginIsBudapest_GetAllDestinations() {
        var destinations = flightService.getDestinationsByOrigin("Budapest");
        assertTrue(destinations.size() != 0);
    }

    @Test
    public void getAllFlightsByOriginAndDestination_WhenCalled_GetAllFlights(){
        var flights = flightService.getAllFlightsByOriginAndDestination("Seville", "Budapest");
        assertTrue(flights.size() == 0);
    }

    @Test
    public void getAllFlightsByLuggageAndOriginDestinations_WhenLuggageIsFalse_GetAllFlights(){
        var flights=flightService.getAllFlightsByLuggageAndOriginDestinations("Budapest", "Seville", false);
        assertTrue(flights.size() == 1);
    }

    @Test
    public void getAllFlightsByLuggageAndOriginDestinations_WhenLuggageIsTrue_GetAllFlights() {
        var flights = flightService.getAllFlightsByLuggageAndOriginDestinations("Budapest", "Seville", true);
        assertTrue(flights.size() == 1);
    }

    @Test
    public void getAllFlightsByAirlineAndOriginDestinations_AirlineIsWizzAir_GetAllFlights(){
        var flights=flightService.getAllFlightsByAirlineAndOriginDestinations("Budapest", "Seville", "WizzAir");
        assertTrue(flights.size() == 2);
    }
}
