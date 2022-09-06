package com.interview.vehicles.app.providers.h2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VehicleH2Repository extends CrudRepository<VehicleExternalInformation, Long> {

    VehicleExternalInformation findByLicenseAndCountryCode(String license, String countryCode);
}
