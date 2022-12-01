package com.csenge.gog.passangers.service;

import com.csenge.gog.passangers.entity.Passengers;
import com.csenge.gog.passangers.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    @Autowired
    PassengerRepository passengerRepository;

    public Passengers addNewPassengers(Passengers passengers){
        return passengerRepository.save(passengers);
    }

    public Passengers findPassengersById(long id){
        return passengerRepository.findById(id).get();
    }
}
