package com.interview.vehicles.app.providers.h2;

import com.interview.vehicles.app.providers.converter.VehiclesConverter;
import com.interview.vehicles.app.providers.dto.VehicleDTO;
import com.interview.vehicles.app.providers.strategy.ProviderEnum;
import com.interview.vehicles.app.providers.strategy.ProviderType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VehiclesProviderOtherDb implements ProviderType {

    @Autowired
    private VehicleH2Repository vehicleH2Repository;

    @Autowired
    private VehiclesConverter vehiclesConverter;
    @Override
    public ProviderEnum getType() {
        return ProviderEnum.PROVIDER_DATABASE;
    }

    @Override
    public List<VehicleDTO> getDataByLicenseAndCountryCode(String license, String countryCode) {
        return List.of(vehiclesConverter.entityVehicleExternalToDto(vehicleH2Repository.
                findByLicenseAndCountryCode(license, countryCode)));
    }
}
