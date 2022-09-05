package com.interview.vehicles.app.providers.client;


import com.interview.vehicles.app.providers.strategy.ProviderType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "vehiclesClient", url = "${client.external.data}/api/v1/vehicles/vehicles")
public interface VehiclesClient {

    @GetMapping
    List<VehicleDTO> getDataByLicenseAndCountryCode(@RequestParam String license, @RequestParam String countryCode);
}
