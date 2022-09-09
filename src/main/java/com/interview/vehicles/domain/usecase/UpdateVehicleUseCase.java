package com.interview.vehicles.domain.usecase;


import com.interview.vehicles.domain.entity.VehicleEntity;
import com.interview.vehicles.domain.providers.UpdateVehicleProvider;
import org.springframework.stereotype.Service;

@Service
public class UpdateVehicleUseCase {

    private UpdateVehicleProvider updateVehicleProvider;

    public UpdateVehicleUseCase(UpdateVehicleProvider updateVehicleProvider) {
        this.updateVehicleProvider = updateVehicleProvider;
    }

    public VehicleEntity execute(Long id, VehicleEntity vehicleEntity) {
        return updateVehicleProvider.updateVehicle(id, vehicleEntity);
    }
}
