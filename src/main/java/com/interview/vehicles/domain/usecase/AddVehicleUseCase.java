package com.interview.vehicles.domain.usecase;

import com.interview.vehicles.app.providers.repository.Vehicle;
import com.interview.vehicles.domain.entity.VehicleEntity;
import com.interview.vehicles.domain.providers.AddVehicleProvider;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddVehicleUseCase {

    private AddVehicleProvider addVehicleProvider;

    public AddVehicleUseCase(AddVehicleProvider addVehicleProvider) {
        this.addVehicleProvider = addVehicleProvider;
    }
    public String execute(Vehicle vehicleEntity) {
        addVehicleProvider.saveVehicle(vehicleEntity);
        return "";
    }
}
