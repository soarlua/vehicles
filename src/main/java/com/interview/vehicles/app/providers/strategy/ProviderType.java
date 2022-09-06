package com.interview.vehicles.app.providers.strategy;

import com.interview.vehicles.app.providers.dto.VehicleDTO;

import java.util.List;

public interface ProviderType {

    ProviderEnum getType();

    List<VehicleDTO> getDataByLicenseAndCountryCode( String license, String countryCode);
}
