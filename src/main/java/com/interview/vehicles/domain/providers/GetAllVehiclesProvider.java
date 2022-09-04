package com.interview.vehicles.domain.providers;

import com.interview.vehicles.domain.entity.VehicleEntity;

import java.util.List;

public interface GetAllVehiclesProvider {
     List<VehicleEntity> getAll();
}
