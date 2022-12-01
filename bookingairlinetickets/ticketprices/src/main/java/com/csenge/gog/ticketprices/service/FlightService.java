package com.csenge.gog.ticketprices.service;

import com.csenge.gog.ticketprices.entity.Flights;
import com.csenge.gog.ticketprices.repository.FlightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightsRepository flightsRepository;

    public Flights getLuggagePrice(long id){
        List<Flights> elements = flightsRepository.findById(id).stream().toList();
        int price = 0;
        for (Flights element:elements){
            price =+ element.getLuggagePrice();
        }
        return flightsRepository.getReferenceById(id);
    }

    public Flights getAgePrice(long id){
        List<Flights> elements = flightsRepository.findById(id).stream().toList();
        int price = 0;
        for (Flights element:elements){
            price =+ element.getAgePrice();
        }
        return flightsRepository.getReferenceById(id);
    }
}
