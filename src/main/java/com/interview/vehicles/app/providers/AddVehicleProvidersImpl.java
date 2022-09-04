package com.interview.vehicles.app.providers;

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
    @Override
    public void saveVehicle(Vehicle vehicleEntity) {
        vehicleRepository.save(vehicleEntity);
    }
}
