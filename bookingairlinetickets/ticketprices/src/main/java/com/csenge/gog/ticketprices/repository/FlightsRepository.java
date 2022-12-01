package com.csenge.gog.ticketprices.repository;

import com.csenge.gog.ticketprices.entity.Flights;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightsRepository extends JpaRepository<Flights, Long> {
}
