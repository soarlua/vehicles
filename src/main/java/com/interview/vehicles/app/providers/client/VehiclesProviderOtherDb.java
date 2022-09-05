package com.interview.vehicles.app.providers.client;

import com.interview.vehicles.app.providers.strategy.ProviderEnum;
import com.interview.vehicles.app.providers.strategy.ProviderType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VehiclesProviderOtherDb implements ProviderType {
    @Override
    public ProviderEnum getType() {
        return ProviderEnum.PROVIDER_DATABASE;
    }

    @Override
    public List<VehicleDTO> getDataByLicenseAndCountryCode(String license, String countryCode) {
        return null;
    }
}
