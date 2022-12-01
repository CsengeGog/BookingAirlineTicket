package com.csenge.gog.passangers.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "passenger")
@Entity
@Data
public class Passengers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name = "first_name")
    private String firstName;

    @Column (name = "sure_name")
    private String sureName;

    @Column (name = "nationality")
    private String nationality;

    @Column (name = "identification")
    private int identification;

    @Column (name = "age")
    private int age;
}
