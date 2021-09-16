package com.shrishti.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean
	public NewVehicle getNewVehicle() {
		return new NewVehicle();

	}

	@Bean
	public NewEngine getNewEngine() {
		return new NewEngine();

	}

}
