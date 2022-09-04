package com.interview.vehicles.domain.providers;

import com.interview.vehicles.app.providers.repository.Vehicle;

public interface AddVehicleProvider {

    void saveVehicle(Vehicle vehicleEntity);

}
