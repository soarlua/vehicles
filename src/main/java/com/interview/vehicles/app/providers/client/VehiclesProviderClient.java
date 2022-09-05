package com.interview.vehicles.app.providers.client;

import com.interview.vehicles.app.providers.strategy.ProviderEnum;
import com.interview.vehicles.app.providers.strategy.ProviderType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VehiclesProviderClient implements ProviderType {

    @Autowired
    private VehiclesClient vehiclesClient;
    @Override
    public ProviderEnum getType() {
        return ProviderEnum.PROVIDER_EXTERNAL_API;
    }

    @Override
    public List<VehicleDTO> getDataByLicenseAndCountryCode(String license, String countryCode) {
        return vehiclesClient.getDataByLicenseAndCountryCode(license, countryCode);
    }
}
