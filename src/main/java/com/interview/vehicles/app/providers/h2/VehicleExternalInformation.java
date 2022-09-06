package com.interview.vehicles.app.providers.h2;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "VEHICLE_EXTERNAL_INFORMATION")
public class VehicleExternalInformation {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "LICENSE")
    private String license;

    @Column(name = "COUNTRY_CODE")
    private String countryCode;

    @Column(name = "RISK_FACTOR")
    private Double riskFactor;

    @Column(name = "NUMBER_DOORS")
    private Integer numberOfDoors;

    @Column(name = "FUEL_TYPE")
    private String fuelType;

    @Column(name = "POWER")
    private Integer Power;

}
