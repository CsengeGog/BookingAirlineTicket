package com.csenge.gog.passangers.repository;

import com.csenge.gog.passangers.entity.Passengers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passengers, Long> {
}
