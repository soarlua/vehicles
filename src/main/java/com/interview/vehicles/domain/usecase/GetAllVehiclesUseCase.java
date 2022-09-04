package com.interview.vehicles.domain.usecase;

import com.interview.vehicles.domain.entity.VehicleEntity;
import com.interview.vehicles.domain.providers.GetAllVehiclesProvider;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllVehiclesUseCase {

    private GetAllVehiclesProvider getAllVehiclesProvider;

    public GetAllVehiclesUseCase(GetAllVehiclesProvider getAllVehiclesProvider) {
        this.getAllVehiclesProvider = getAllVehiclesProvider;
    }

    public List<VehicleEntity> execute() {
        return getAllVehiclesProvider.getAll();
    }
}
