package com.interview.vehicles.domain.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class VehicleEntity {

    private Long id;

    private String license;

    private String countryCode;

    private Double riskFactor;

    private Integer numberOfDoors;

    private String fuelType;

    private Integer Power;
}
