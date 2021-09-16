package com.shrishti.autowired;

import org.springframework.stereotype.Component;

@Component("rectangle")
public class Rectangle implements Shape {

	@Override
	public void area(int length, int breadth) {
		System.out.println("Area of Rectangle: "+length*breadth);
	}

}
