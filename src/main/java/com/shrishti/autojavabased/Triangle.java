package com.shrishti.autojavabased;

import org.springframework.stereotype.Component;

public class Triangle implements Shape {

	@Override
	public void area(int length, int breadth) {
		System.out.println("Area of Triangle: " + (length * breadth) * 0.5);
	}

}
