package com.interview.vehicles.domain.usecase.validate;

import com.interview.vehicles.domain.entity.VehicleEntity;


public interface WorkflowValidated {

    Pair isValid(VehicleEntity vehicleEntity);
}
