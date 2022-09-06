package com.interview.vehicles.app.providers.dto;

import lombok.Data;

@Data
public class VehicleDTO {

    private Long id;

    private String license;

    private String countryCode;

    private Double riskFactor;

    private Integer numberOfDoors;

    private String fuelType;

    private Integer Power;
}
