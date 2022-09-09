package com.interview.vehicles.app.providers.converter;

import com.interview.vehicles.app.providers.dto.VehicleDTO;
import com.interview.vehicles.app.providers.h2.VehicleExternalInformation;
import com.interview.vehicles.app.providers.repository.Vehicle;
import com.interview.vehicles.domain.entity.VehicleEntity;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class VehiclesConverter {
    public List<VehicleEntity> toVehicleEntity(Iterable<Vehicle> vehicles) {
        List<VehicleEntity> vehicleEntities = new ArrayList<>();

        vehicles.forEach(vehicle -> {
            VehicleEntity vehicleEntity = new VehicleEntity();
            vehicleEntity.setLicense(vehicle.getLicense());
            vehicleEntity.setRiskFactor(vehicle.getRiskFactor());
            vehicleEntity.setNumberOfDoors(vehicle.getNumberOfDoors());
            vehicleEntity.setPower(vehicle.getPower());
            vehicleEntity.setCountryCode(vehicle.getCountryCode());
            vehicleEntity.setFuelType(vehicle.getFuelType());
            vehicleEntity.setId(vehicle.getId());
            vehicleEntities.add(vehicleEntity);
        });

        return vehicleEntities;
    }

    public Vehicle toVehicleEntity(VehicleEntity vehicleEntity) {
        Vehicle vehicle = new Vehicle();

        vehicle.setLicense(vehicleEntity.getLicense());
        vehicle.setRiskFactor(vehicleEntity.getRiskFactor());
        vehicle.setNumberOfDoors(vehicleEntity.getNumberOfDoors());
        vehicle.setPower(vehicleEntity.getPower());
        vehicle.setCountryCode(vehicleEntity.getCountryCode());
        vehicle.setFuelType(vehicleEntity.getFuelType());
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

    public VehicleDTO entityVehicleExternalToDto(VehicleExternalInformation vehicleExternalInformation) {
        VehicleDTO vehicleDTO = new VehicleDTO();
        vehicleDTO.setLicense(vehicleExternalInformation.getLicense());
        vehicleDTO.setFuelType(vehicleExternalInformation.getFuelType());
        vehicleDTO.setId(vehicleExternalInformation.getId());
        vehicleDTO.setCountryCode(vehicleExternalInformation.getCountryCode());
        vehicleDTO.setNumberOfDoors(vehicleExternalInformation.getNumberOfDoors());
        vehicleDTO.setPower(vehicleExternalInformation.getPower());
        return vehicleDTO;
    }

    public VehicleEntity vehicleToVehicleEntity(Optional<Vehicle> vehicle) {
        VehicleEntity vehicleEntity = new VehicleEntity();

        vehicleEntity.setLicense(vehicle.get().getLicense());
        vehicleEntity.setRiskFactor(vehicle.get().getRiskFactor());
        vehicleEntity.setNumberOfDoors(vehicle.get().getNumberOfDoors());
        vehicleEntity.setPower(vehicle.get().getPower());
        vehicleEntity.setCountryCode(vehicle.get().getCountryCode());
        vehicleEntity.setId(vehicle.get().getId());
        vehicleEntity.setFuelType(vehicle.get().getFuelType());

        return vehicleEntity;
    }
}
