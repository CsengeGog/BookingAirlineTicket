package com.csenge.gog.passangers;

import com.csenge.gog.passangers.entity.Passengers;
import com.csenge.gog.passangers.service.PassengerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PassengerServiceTest {

    PassengerService passengerService;
    Passengers passengers;

    @BeforeEach
    public void initialize(){
        passengerService=new PassengerService();
        passengers=new Passengers();

        passengers.setId(1);
        passengers.setFirstName("Csenge");
        passengers.setSureName("Góg");
        passengers.setNationality("Hungarian");
        passengers.setIdentification(2355678);
        passengers.setAge(24);
    }

    @Test
    public void addNewPassengers_WhenCalled_getNewPassenger(){
        var passenger = passengerService.addNewPassengers(passengers);
        assertTrue(passengerService.equals(passenger));
    }

    @Test
    public void findPassengersById_WhenCalled_getAllPassengersById() {
        var passenger = passengerService.findPassengersById(1);
        assertTrue(passengerService.equals(passenger));
    }
}
