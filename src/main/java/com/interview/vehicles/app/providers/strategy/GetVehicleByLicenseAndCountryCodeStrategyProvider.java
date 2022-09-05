package com.interview.vehicles.app.providers.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetVehicleByLicenseAndCountryCodeStrategyProvider {

    @Autowired
    private List<ProviderType> providerTypes;

    public ProviderType getProvider(ProviderEnum providerEnum) {

        return providerTypes.stream().filter(t -> t.getType().equals(providerEnum))
                .findFirst().orElseThrow();
    }
}
