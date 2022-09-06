package com.interview.vehicles.app.providers.repository;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String license;

    private String countryCode;

    private Double riskFactor;

    private Integer numberOfDoors;

    private String fuelType;

    private Integer Power;

}
