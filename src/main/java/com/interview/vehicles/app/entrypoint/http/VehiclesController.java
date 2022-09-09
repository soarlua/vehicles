package com.interview.vehicles.app.entrypoint.http;

import com.interview.vehicles.app.providers.repository.Vehicle;
import com.interview.vehicles.app.providers.strategy.ProviderEnum;
import com.interview.vehicles.domain.entity.VehicleEntity;
import com.interview.vehicles.domain.usecase.AddVehicleUseCase;
import com.interview.vehicles.domain.usecase.GetAllVehiclesUseCase;
import com.interview.vehicles.domain.usecase.UpdateVehicleUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/vehicles")
@RestController
public class VehiclesController {

    @Autowired
    private GetAllVehiclesUseCase getAllVehiclesUseCase;

    @Autowired
    private AddVehicleUseCase addVehicleUseCase;

    @Autowired
    private UpdateVehicleUseCase updateVehicleUseCase;

    @GetMapping
    public List<VehicleEntity> getAllVehicles() {
        return getAllVehiclesUseCase.execute();
    }

    @PostMapping
    public void addVehicle(@RequestHeader ProviderEnum provider, @RequestBody VehicleEntity vehicleEntity) {
        addVehicleUseCase.execute(provider, vehicleEntity);
    }

    @PatchMapping(path = "/{id}")
    public VehicleEntity updateVehicle(@NonNull @PathVariable("id") Long id, @RequestBody VehicleEntity vehicleEntity) {
        return updateVehicleUseCase.execute(id,vehicleEntity);
    }



}
