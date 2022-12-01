package com.csenge.gog.passangers.controller;

import com.csenge.gog.passangers.entity.Passengers;
import com.csenge.gog.passangers.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PassengerController {

    @Autowired
    PassengerService passengerService;
    //list all passengers
   /* @GetMapping("/passengers")
    public ResponseEntity<List<Passengers>> getAllPassengers(){
        List<Passengers> responseBody = passengerService.getAllPassengers();
        if (responseBody == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        }
    }*/
    //create new passenger
    @PostMapping("/passenger")
    public ResponseEntity<Passengers> addNewPassengers(@RequestBody Passengers passengers){
        Passengers responseBody= passengerService.addNewPassengers(passengers);
        if (responseBody == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        else {
            return new ResponseEntity<>(responseBody, HttpStatus.CREATED);
        }
    }

    @GetMapping("/passenger/{id}")
    public ResponseEntity<Passengers> findPassengersById(@PathVariable Long id){
        Passengers responseBody = passengerService.findPassengersById(id);
        if (responseBody == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        }
    }
}
