
package com.shrishti.autojavabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class ShapeFactory {
	@Autowired
	@Qualifier("srectangle")
	Shape shape;

	@Autowired
	@Qualifier("striangle")
	Shape tshape;

	@Autowired
	Shape sShape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void printArea(String choice) {
		System.out.println("Printing....");
		if (choice.equals("r"))
			shape.area(10, 20);
		if (choice.equals("t"))
			tshape.area(10, 20);
		if (choice.equals("s"))
			sShape.area(10, 20);
	}
}
