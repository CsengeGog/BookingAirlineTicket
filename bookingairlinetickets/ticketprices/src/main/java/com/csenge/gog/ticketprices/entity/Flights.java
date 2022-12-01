package com.csenge.gog.ticketprices.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@EntityScan
@Table(name = "flights")
@Data
public class Flights {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    //@JoinColumn(name = "flightId")
    //private Flights flightId;

    @Column(name = "luggage_price")
    private int luggagePrice;

    @Column(name = "age-price")
    private int agePrice;

}
