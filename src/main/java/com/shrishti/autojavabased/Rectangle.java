package com.shrishti.autojavabased;

import org.springframework.stereotype.Component;

public class Rectangle implements Shape {

	@Override
	public void area(int length, int breadth) {
		System.out.println("Area of Rectangle: "+length*breadth);
	}

}
