package com.interview.vehicles.app.providers.client;

import lombok.Data;

@Data
public class VehicleDTO {

    private Long id;

    private String license;

    private String countryCode;

    private Double riskDecimal;

    private Integer numberOfDoors;

    private String fuelType;

    private Integer Power;
}
