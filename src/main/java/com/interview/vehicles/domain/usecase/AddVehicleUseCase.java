package com.interview.vehicles.domain.usecase;

import com.interview.vehicles.app.providers.strategy.ProviderEnum;
import com.interview.vehicles.domain.entity.VehicleEntity;
import com.interview.vehicles.domain.providers.AddVehicleProvider;
import com.interview.vehicles.domain.providers.GetVehicleByLicenseAndCountryCodeProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class AddVehicleUseCase {

    private AddVehicleProvider addVehicleProvider;
    private GetVehicleByLicenseAndCountryCodeProvider getVehicleByLicenseAndCountryCode;

    public AddVehicleUseCase(AddVehicleProvider addVehicleProvider, GetVehicleByLicenseAndCountryCodeProvider getVehicleByLicenseAndCountryCode) {
        this.addVehicleProvider = addVehicleProvider;
        this.getVehicleByLicenseAndCountryCode = getVehicleByLicenseAndCountryCode;
    }
    public VehicleEntity execute(ProviderEnum provider,VehicleEntity vehicleEntity) {
//todo VERIFICAR SE EXISTE NA BASE SE EXISTIR DEVOLVER UM ERRO
        //Spring hANDLEException para manipular excecoes

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
