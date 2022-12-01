package com.csenge.gog.airlinedetails.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "flight")
@Entity
@Data
public class Flight implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JoinColumn(name = "airline_name")
    private Airline airlineName;

    @Column (name = "flight_number")
    private int flightNumber;

    @Column (name = "departure_time")
    private LocalDate departureTime;

    @Column (name = "layovers")
    private int layovers;

    @Column (name = "transit_time")
    private LocalDate transitTime;

    @Column (name = "luggage")
    private boolean luggage;

    @Column (name = "price")
    private int price;

    @Column (name = "origin")
    private String origin;

    @Column (name = "destination")
    private String destination;
}
