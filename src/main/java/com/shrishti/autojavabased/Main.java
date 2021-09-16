package com.shrishti.autojavabased;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shrishti.autojavabased");
		String[] beanNames = context.getBeanDefinitionNames();
		Stream.of(beanNames).forEach(System.out::println);
		ShapeFactory factory=context.getBean("shapeFactory",ShapeFactory.class);
		factory.printArea("r");
		factory.printArea("s");
		factory.printArea("t");


	}

}
