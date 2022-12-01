package com.csenge.gog.airlinedetails.service;

import com.csenge.gog.airlinedetails.entity.Flight;
import com.csenge.gog.airlinedetails.repository.AirlineRepository;
import com.csenge.gog.airlinedetails.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.lang.model.util.Elements;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

   public List<String> getOrigins(){
        List<Flight> origins = flightRepository.findAll();
        return origins
                .stream()
                .map(Flight::getOrigin)
                .distinct()
                .collect(Collectors.toList());
   }

   public List<String> getDestinationsByOrigin(String origin){
       List<Flight> destination = flightRepository.findAll();
       return destination
               .stream()
               .filter(x->x.getOrigin().equals(origin))
               .map(Flight::getDestination)
               .distinct()
               .collect(Collectors.toList());
   }

   public List<Flight> getAllFlightsByOriginAndDestination(String origin, String destination){
       List<Flight> flights = flightRepository.findAll();
       return flights
               .stream()
               .filter(x->x.getOrigin().equals(origin) && x.getDestination().equals(destination))
               .collect(Collectors.toList());
   }

   //Filtering by luggage
   public List<Flight> getAllFlightsByLuggageAndOriginDestinations(String origin, String destination, boolean luggage){
       List<Flight> flights = flightRepository.findAll();
       if (luggage == true){
           return flights
                   .stream()
                   .filter(x-> x.isLuggage()==true && x.getOrigin().equals(origin) && x.getDestination().equals(destination))
                   .collect(Collectors.toList());
       }
       else {
           return flights
                   .stream()
                   .filter(x->x.isLuggage()==false && x.getOrigin().equals(origin) && x.getDestination().equals(destination))
                   .collect(Collectors.toList());
       }

   }

   //Filtering by AirlineName
   public List<Flight> getAllFlightsByAirlineAndOriginDestinations(String origin, String destination, String airlineName){
       List<Flight> flights = flightRepository.findAll();
       return flights
               .stream()
               .filter(x->x.getOrigin().equals(origin) && x.getDestination().equals(destination)&& x.getAirlineName().equals(airlineName))
               .collect(Collectors.toList());
   }
}
