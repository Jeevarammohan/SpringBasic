package com.shrishti.basic;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shrishti.basic");
		// Employee employee=(Employee) context.getBean("employee");
		// Employee employee1 = context.getBean(Employee.class);
		Employee employee1 = context.getBean("employee", Employee.class);
		System.out.println(employee1);
		Address address = context.getBean("address", Address.class);
		System.out.println(address);
		Mobile mobile = context.getBean("mobile", Mobile.class);
		System.out.println(mobile.getFeatures().getProcessor());
		String beanNames[] = context.getBeanDefinitionNames();
		Stream.of(beanNames).forEach(System.out::println);
	}

}
