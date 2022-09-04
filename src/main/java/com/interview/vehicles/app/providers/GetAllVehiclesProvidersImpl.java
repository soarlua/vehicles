package com.interview.vehicles.app.providers;

import com.interview.vehicles.app.providers.converter.VehiclesConverter;
import com.interview.vehicles.app.providers.repository.VehicleRepository;
import com.interview.vehicles.domain.entity.VehicleEntity;
import com.interview.vehicles.domain.providers.GetAllVehiclesProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllVehiclesProvidersImpl implements GetAllVehiclesProvider {

    @Autowired
    private VehiclesConverter vehiclesConverter;

    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public List<VehicleEntity> getAll() {
        return vehiclesConverter.toVehicleEntity(vehicleRepository.findAll());
    }
}
