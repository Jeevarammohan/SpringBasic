package com.shrishti.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	@Bean
	@Primary // to have this in priority
	public Vehicle getVehicle() {
		Vehicle vehicle = new Vehicle();
		vehicle.setBrand("Honda");
		vehicle.setPrice(98000);
		vehicle.setEngine(getEngine());
		return vehicle;

	}

	@Bean
	public Engine getEngine() {
		Engine engine = new Engine();
		engine.setType("Motor");
		engine.setMileage("80");
		return engine;
	}
}
