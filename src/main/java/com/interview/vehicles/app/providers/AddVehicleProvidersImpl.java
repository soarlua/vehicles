package com.interview.vehicles.app.providers;

import com.interview.vehicles.app.providers.converter.VehiclesConverter;
import com.interview.vehicles.app.providers.repository.Vehicle;
import com.interview.vehicles.app.providers.repository.VehicleRepository;
import com.interview.vehicles.domain.entity.VehicleEntity;
import com.interview.vehicles.domain.providers.AddVehicleProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddVehicleProvidersImpl implements AddVehicleProvider {

    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private VehiclesConverter vehiclesConverter;
    @Override
    public void saveVehicle(VehicleEntity vehicleEntity) {

        vehicleRepository.save(vehiclesConverter.toVehicleEntity(vehicleEntity));
    }
}
