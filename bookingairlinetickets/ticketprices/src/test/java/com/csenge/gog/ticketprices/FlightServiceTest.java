package com.csenge.gog.ticketprices;

import com.csenge.gog.ticketprices.entity.Flights;
import com.csenge.gog.ticketprices.service.FlightService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlightServiceTest {

    FlightService flightService;
    Flights flights1;

    @BeforeEach
    public void initialize(){
        flightService = new FlightService();
        flights1 = new Flights();

        //flights1.setFlightId(flights1);
        flights1.setLuggagePrice(50);
        flights1.setAgePrice(25);

    }

    @Test
    public void getLuggagePrice_WhenCalled_GetLuggageIsTrue(){
        var luggage = flightService.getLuggagePrice(1);
        assertTrue(luggage.equals(1));
    }

    @Test
    public void getAgePrice_WhenCalled_AgeIsBetweenTwoAndNine(){
        var age=flightService.getAgePrice(5);
        assertTrue(age.equals(5));
    }
}
