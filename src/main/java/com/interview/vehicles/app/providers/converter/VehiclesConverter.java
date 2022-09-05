package com.interview.vehicles.app.providers.converter;

import com.interview.vehicles.app.providers.client.VehicleDTO;
import com.interview.vehicles.app.providers.repository.Vehicle;
import com.interview.vehicles.domain.entity.VehicleEntity;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class VehiclesConverter {
    public List<VehicleEntity> toVehicleEntity(Iterable<Vehicle> vehicles) {
        List<VehicleEntity> vehicleEntities = new ArrayList<>();

        vehicles.forEach(vehicle -> {
            VehicleEntity vehicleEntity = new VehicleEntity();
            vehicleEntity.setLicense(vehicle.getLicense());
            vehicleEntity.setRiskDecimal(vehicle.getRiskDecimal());
            vehicleEntity.setNumberOfDoors(vehicle.getNumberOfDoors());
            vehicleEntity.setPower(vehicle.getPower());
            vehicleEntity.setCountryCode(vehicle.getCountryCode());
            vehicleEntity.setId(vehicle.getId());
            vehicleEntities.add(vehicleEntity);
        });

        return vehicleEntities;
    }

    public Vehicle toVehicleEntity(VehicleEntity vehicleEntity) {
        Vehicle vehicle = new Vehicle();

        vehicle.setLicense(vehicleEntity.getLicense());
        vehicle.setRiskDecimal(vehicleEntity.getRiskDecimal());
        vehicle.setNumberOfDoors(vehicleEntity.getNumberOfDoors());
        vehicle.setPower(vehicleEntity.getPower());
        vehicle.setCountryCode(vehicleEntity.getCountryCode());
        vehicle.setId(vehicleEntity.getId());

        return vehicle;
    }
    public VehicleEntity dtoToVehicleEntity(VehicleDTO vehicleDTO) {
        VehicleEntity vehicleEntity = new VehicleEntity();
        vehicleEntity.setId(vehicleDTO.getId());
        vehicleEntity.setFuelType(vehicleDTO.getFuelType());
        vehicleEntity.setLicense(vehicleDTO.getLicense());
        vehicleEntity.setNumberOfDoors(vehicleDTO.getNumberOfDoors());
        vehicleEntity.setCountryCode(vehicleDTO.getCountryCode());
        vehicleEntity.setPower(vehicleDTO.getPower());
        return vehicleEntity;
    }
}
