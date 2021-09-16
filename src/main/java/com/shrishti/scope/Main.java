package com.shrishti.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.shrishti.scope");
		Course course1=context.getBean("course",Course.class);
		//System.out.println(course1.getCourseName());
		System.out.println("course-1 "+course1.getCourseName());
		System.out.println("trainer-1 "+course1.getTrainer().getTrainerName());
		Course course2=context.getBean("course",Course.class);
		//System.out.println(course2.getCourseName());
		System.out.println("course-2 "+course2.getCourseName());
		System.out.println("trainer-2 "+course2.getTrainer().getTrainerName());
		course1.setCourseName("Spring");
		course1.getTrainer().setTrainerName("Vani");
//		System.out.println(course1.getCourseName());
//		System.out.println(course2.getCourseName());
		System.out.println("course-1 "+course1.getCourseName());
		System.out.println("trainer-1 "+course1.getTrainer().getTrainerName());
		System.out.println("course-2 "+course2.getCourseName());
		System.out.println("trainer-2 "+course2.getTrainer().getTrainerName());
	}

}
