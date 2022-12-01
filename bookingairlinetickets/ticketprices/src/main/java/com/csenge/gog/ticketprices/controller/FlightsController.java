package com.csenge.gog.ticketprices.controller;

import com.csenge.gog.ticketprices.entity.Flights;
import com.csenge.gog.ticketprices.service.FlightService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FlightsController {

    @Autowired
    FlightService flightService;

    @GetMapping("/flights")
    public ResponseEntity<Flights> getLuggagePriceById(@PathVariable Long id){
        Flights responseBody= flightService.getLuggagePrice(id);
        if (responseBody == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        }
    }

    @GetMapping("/flights")
    public ResponseEntity<Flights> getAgePriceById(@PathVariable Long id){
        Flights responseBody= flightService.getAgePrice(id);
        if (responseBody == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        }
    }
}
