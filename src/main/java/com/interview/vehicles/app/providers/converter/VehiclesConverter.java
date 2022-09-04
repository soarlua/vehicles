package com.interview.vehicles.app.providers.converter;

import com.interview.vehicles.app.providers.repository.Vehicle;
import com.interview.vehicles.domain.entity.VehicleEntity;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VehiclesConverter {

    public List<VehicleEntity> toVehicleEntity(Iterable<Vehicle> vehicles) {
        List<VehicleEntity> vehicleEntities = new ArrayList<>();

        vehicles.forEach(vehicle -> {
            VehicleEntity vehicleEntity = new VehicleEntity();

            vehicleEntities.add(vehicleEntity);
        });

        return vehicleEntities;
    }
}
