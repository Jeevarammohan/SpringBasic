package com.shrishti.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city;
	private Integer zipCode;

	public Address() {
		super();
	}

	public Address(String city, Integer zipCode) {
		super();
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	@Value("${employee.address.city}")
	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	@Value("${employee.address.zipcode}")
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", zipCode=" + zipCode + "]";
	}

}
