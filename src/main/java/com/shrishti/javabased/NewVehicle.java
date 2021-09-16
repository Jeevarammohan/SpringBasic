package com.shrishti.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewVehicle {
	private String brand;
	private double price;

	@Autowired
	private NewEngine newEngine;

	public String getBrand() {
		return brand;
	}

	@Value("Maruthi")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	@Value("9000")
	public void setPrice(double price) {
		this.price = price;
	}

	public NewEngine getNewEngine() {
		return newEngine;
	}

	public void setNewEngine(NewEngine newEngine) {
		this.newEngine = newEngine;
	}

	@Override
	public String toString() {
		return "NewVehicle [brand=" + brand + ", price=" + price + ", newEngine=" + newEngine + "]";
	}

}
