package com.interview.vehicles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class VehiclesApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiclesApplication.class, args);
	}

}
