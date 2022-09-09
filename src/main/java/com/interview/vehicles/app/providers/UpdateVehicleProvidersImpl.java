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
        Vehicle vehicle = new Vehicle();
        vehicle.setId(vehicleEntity.getId());
        vehicle.setLicense(vehicleEntity.getLicense());
        vehicle.setRiskFactor(vehicleEntity.getRiskFactor());
        vehicle.setCountryCode(vehicleEntity.getCountryCode());
        vehicleRepository.save(vehicle);
        return vehiclesConverter.vehicleToVehicleEntity(vehicleRepository.findById(id));

    }
}
