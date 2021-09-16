package com.shrishti.javabased;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shrishti.javabased");
		String[] beanNames = context.getBeanDefinitionNames();
		Stream.of(beanNames).forEach(System.out::println);
//		Vehicle vehicle = context.getBean(Vehicle.class);
//		System.out.println(vehicle);
		NewVehicle newVehicle=context.getBean("newVehicle",NewVehicle.class);
		System.out.println(newVehicle);
		
	}

}
