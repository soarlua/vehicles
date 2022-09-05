package com.interview.vehicles.domain.providers;

import com.interview.vehicles.app.providers.repository.Vehicle;
import com.interview.vehicles.domain.entity.VehicleEntity;

public interface AddVehicleProvider {

    void saveVehicle(VehicleEntity vehicleEntity);

}
