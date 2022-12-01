package com.csenge.gog.airlinedetails.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "airline")
@Entity
public class Airline implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "airline_name")
    private String airlineName;



}
