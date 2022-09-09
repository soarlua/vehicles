package com.interview.vehicles.app.providers;

import com.interview.vehicles.app.providers.converter.VehiclesConverter;
import com.interview.vehicles.app.providers.repository.Vehicle;
import com.interview.vehicles.app.providers.repository.VehicleRepository;
import com.interview.vehicles.domain.entity.VehicleEntity;
import com.interview.vehicles.domain.providers.UpdateVehicleProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UpdateVehicleProvidersImpl implements UpdateVehicleProvider {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehiclesConverter vehiclesConverter;
    @Override
    public VehicleEntity updateVehicle(Long id, VehicleEntity vehicleEntity) {

        Optional<Vehicle> vehicleFounded = vehicleRepository.findById(id);
        if(vehicleFounded.isPresent())
            vehicleFounded.get().setLicense(vehicleEntity.getLicense());
            vehicleFounded.get().setCountryCode(vehicleEntity.getCountryCode());
            vehicleFounded.get().setRiskFactor(vehicleEntity.getRiskFactor());
        vehicleRepository.save(vehicleFounded.get());
        return vehiclesConverter.vehicleToVehicleEntity(vehicleRepository.findById(id));
    }
}
