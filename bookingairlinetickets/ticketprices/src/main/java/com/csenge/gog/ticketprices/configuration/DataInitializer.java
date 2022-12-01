package com.csenge.gog.ticketprices.configuration;

import com.csenge.gog.ticketprices.entity.Flights;
import com.csenge.gog.ticketprices.repository.FlightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class DataInitializer {

    @Autowired
    private FlightsRepository flightsRepository;

    @PostConstruct
    public void init(){
        Flights flights = new Flights();
        flights.setLuggagePrice(35);
        flights.setAgePrice(10);
    }
}
