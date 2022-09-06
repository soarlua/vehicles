package com.interview.vehicles.domain.usecase;

import com.interview.vehicles.app.providers.strategy.ProviderEnum;
import com.interview.vehicles.domain.entity.VehicleEntity;
import com.interview.vehicles.domain.providers.AddVehicleProvider;
import com.interview.vehicles.domain.providers.GetVehicleByLicenseAndCountryCodeProvider;
import com.interview.vehicles.domain.usecase.validate.Pair;
import com.interview.vehicles.domain.usecase.validate.ValidatedException;
import com.interview.vehicles.domain.usecase.validate.WorkflowValidated;
import lombok.extern.slf4j.Slf4j;
import javax.inject.Named;

@Slf4j
@Named
public class AddVehicleUseCase {

    private AddVehicleProvider addVehicleProvider;
    private GetVehicleByLicenseAndCountryCodeProvider getVehicleByLicenseAndCountryCode;

    private WorkflowValidated workflowValidated;

    public AddVehicleUseCase(AddVehicleProvider addVehicleProvider, GetVehicleByLicenseAndCountryCodeProvider
            getVehicleByLicenseAndCountryCode, WorkflowValidated workflowValidated) {
        this.addVehicleProvider = addVehicleProvider;
        this.getVehicleByLicenseAndCountryCode = getVehicleByLicenseAndCountryCode;
        this.workflowValidated = workflowValidated;
    }
    public VehicleEntity execute(ProviderEnum provider,VehicleEntity vehicleEntity) {
//todo VERIFICAR SE EXISTE NA BASE SE EXISTIR DEVOLVER UM ERRO
        //Spring hANDLEException para manipular excecoes
        Pair valid = workflowValidated.isValid(vehicleEntity);
        if(!valid.getFirst()) {
            throw new ValidatedException(valid.getSecond());
        }

        try {

            VehicleEntity dataVehicle = getVehicleByLicenseAndCountryCode.
                    getByLicenseAndCountryCode(provider, vehicleEntity.getLicense(),
                            vehicleEntity.getCountryCode());
            vehicleEntity.setNumberOfDoors(dataVehicle.getNumberOfDoors());
            vehicleEntity.setFuelType(dataVehicle.getFuelType());
            vehicleEntity.setPower(dataVehicle.getPower());
        } catch (Exception e) {
            log.warn("Não encontrado detalhes do veículo na base da dados");
        }
        addVehicleProvider.saveVehicle(vehicleEntity);
        return vehicleEntity;
    }
}
