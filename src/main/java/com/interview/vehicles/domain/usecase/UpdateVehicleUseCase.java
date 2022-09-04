package com.interview.vehicles.domain.usecase;

import com.interview.vehicles.app.providers.repository.Vehicle;
import com.interview.vehicles.domain.entity.VehicleEntity;
import com.interview.vehicles.domain.providers.UpdateVehicleProvider;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpdateVehicleUseCase {

    private UpdateVehicleProvider updateVehicleProvider;

    public UpdateVehicleUseCase(UpdateVehicleProvider updateVehicleProvider) {
        this.updateVehicleProvider = updateVehicleProvider;
    }

    public String execute(Vehicle vehicle) {
        updateVehicleProvider.updateVehicle(vehicle);
        return "";
    }
}
