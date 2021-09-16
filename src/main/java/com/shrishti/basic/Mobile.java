package com.shrishti.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	private String model;
	private String brand;
	private double price;
	@Autowired
	private Features features;

////	//@Autowired
//	public Mobile(Features features) {
//		super();
//		this.features = features;
//	}
	public String getModel() {
		return model;
	}

	@Value("j7")
	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	@Value("Samsung")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	@Value("8000")
	public void setPrice(double price) {
		this.price = price;
	}

	public Features getFeatures() {
		return features;
	}

	public void setFeatures(Features features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", price=" + price + ", features=" + features + "]";
	}

}
