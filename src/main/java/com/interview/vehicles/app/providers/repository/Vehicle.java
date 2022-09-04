package com.interview.vehicles.app.providers.repository;

import com.sun.istack.NotNull;
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

    @NotNull
    private String license;

    @NotNull
    private String countryCode;

    @NotNull
    private Double riskDecimal;

    private Integer numberOfDoors;

    private String fuelType;

    private Integer Power;

}
