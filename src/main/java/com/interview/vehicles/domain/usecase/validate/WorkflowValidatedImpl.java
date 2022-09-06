package com.interview.vehicles.domain.usecase.validate;

import com.interview.vehicles.domain.entity.VehicleEntity;


import javax.inject.Named;

@Named
public class WorkflowValidatedImpl implements WorkflowValidated{
    @Override
    public Pair isValid(VehicleEntity vehicleEntity) {
        if(vehicleEntity.getRiskFactor() < 0.00 || vehicleEntity.getRiskFactor() > 1)
            return Pair.builder().first(true).second("Risk Factor invalid").build();
        return Pair.builder().first(true).second("ok").build();
    }
}
