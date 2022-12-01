package com.csenge.gog.airlinedetails.configuration;

import com.csenge.gog.airlinedetails.entity.Airline;
import com.csenge.gog.airlinedetails.entity.Flight;
import com.csenge.gog.airlinedetails.repository.AirlineRepository;
import com.csenge.gog.airlinedetails.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class Data {
    @Autowired
    private AirlineRepository airlineRepository;

    @Autowired
    private FlightRepository flightRepository;

    @PostConstruct
    public void init(){
        Airline airline1 = new Airline();
        airline1.setAirlineName("Ryanair");

        Airline airline2 = new Airline();
        airline2.setAirlineName("WizzAir");

        Flight flight1 = new Flight();

        flight1.setAirlineName(airline1);
        flight1.setFlightNumber(199810);
        flight1.setDestination("Rome");
        flight1.setOrigin("Budapest");
        flight1.setLayovers(0);
        flight1.setTransitTime(LocalDate.from(LocalDateTime.now()));
        flight1.setDepartureTime(LocalDate.now());

        flightRepository.save(flight1);

    }
}
