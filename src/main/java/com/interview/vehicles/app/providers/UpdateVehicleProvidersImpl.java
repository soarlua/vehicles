package com.interview.vehicles.app.providers;

import com.interview.vehicles.app.providers.repository.Vehicle;
import com.interview.vehicles.app.providers.repository.VehicleRepository;
import com.interview.vehicles.domain.providers.UpdateVehicleProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateVehicleProvidersImpl implements UpdateVehicleProvider {

    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public void updateVehicle(Vehicle vehicle) {
  //      vehicleRepository. num sei

    }
}
