package com.shrishti.autowired;

import org.springframework.stereotype.Component;

@Component("tshape")
public class Triangle implements Shape {

	@Override
	public void area(int length, int breadth) {
		System.out.println("Area of Triangle: " + (length * breadth) * 0.5);
	}

}
