package com.interview.vehicles.domain.providers;

import com.interview.vehicles.app.providers.strategy.ProviderEnum;
import com.interview.vehicles.domain.entity.VehicleEntity;

public interface
GetVehicleByLicenseAndCountryCodeProvider {
    VehicleEntity getByLicenseAndCountryCode(ProviderEnum providerEnum, String license, String countryCode);
}
