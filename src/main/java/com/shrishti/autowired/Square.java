package com.shrishti.autowired;

import org.springframework.stereotype.Component;

@Component("sShape")
public class Square implements Shape {

	@Override
	public void area(int length, int breadth) {
		System.out.println("Area of Square: "+length*length);
	}

}
