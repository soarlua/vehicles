package com.interview.vehicles.app.providers;

import com.interview.vehicles.app.providers.client.VehicleDTO;
import com.interview.vehicles.app.providers.client.VehiclesClient;
import com.interview.vehicles.app.providers.converter.VehiclesConverter;
import com.interview.vehicles.app.providers.strategy.GetVehicleByLicenseAndCountryCodeStrategyProvider;
import com.interview.vehicles.app.providers.strategy.ProviderEnum;
import com.interview.vehicles.domain.entity.VehicleEntity;
import com.interview.vehicles.domain.providers.GetVehicleByLicenseAndCountryCodeProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetVehicleByLicenseAndCountryCodeProviderImpl implements GetVehicleByLicenseAndCountryCodeProvider {

    @Autowired
    private VehiclesConverter vehiclesConverter;

    @Autowired
    private GetVehicleByLicenseAndCountryCodeStrategyProvider strategy;
    @Override
    public VehicleEntity getByLicenseAndCountryCode(ProviderEnum providerEnum, String license, String countryCode) {

        VehicleDTO provider = strategy.getProvider(providerEnum).getDataByLicenseAndCountryCode(
                license, countryCode).stream().findFirst().orElseThrow();

        return vehiclesConverter.dtoToVehicleEntity(provider);
    }
}
