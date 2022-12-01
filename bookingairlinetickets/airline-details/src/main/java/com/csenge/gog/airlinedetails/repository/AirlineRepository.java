package com.csenge.gog.airlinedetails.repository;

import com.csenge.gog.airlinedetails.entity.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {
}
