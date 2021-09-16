package com.shrishti.javabased;

public class Vehicle {
	private String brand;
	private double price;
	private Engine engine;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", price=" + price + ", engine=" + engine + "]";
	}

}
