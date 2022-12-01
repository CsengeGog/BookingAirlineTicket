package com.csenge.gog.airlinedetails.service;

import com.csenge.gog.airlinedetails.repository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineService {

    @Autowired
    AirlineRepository airlineRepository;


}
