package com.shrishti.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shrishti.autowiring");
//		Shape shape = context.getBean("rectangle", Rectangle.class);
//		shape.area(10, 20);
//		shape = context.getBean("triangle", Triangle.class);
//		shape.area(10, 20);
//		shape = context.getBean("square", Square.class);
//		shape.area(10, 20);

//		Shape shape = new Rectangle();
//		ShapeFactory factory=new ShapeFactory();
//		factory.setShape(shape);
//		factory.printArea();
//		shape = new Triangle();
//		factory.setShape(shape);
//		factory.printArea();
		ShapeFactory factory=context.getBean("shapeFactory",ShapeFactory.class);
		factory.printArea("s");
	}

}
