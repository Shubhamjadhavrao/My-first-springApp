package com.prowings.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testEmpSpringContainer {
    
    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
	
//	Employee emp1 = context.getBean(Employee.class,"emp");
//	Employee emp2 = context.getBean(Employee.class,"emp");
//	
//	System.out.println(emp1==emp2);
//	
//	System.out.println(emp1);
	
	Student std = context.getBean(Student.class,"std");
	System.out.println(std);
	
	Car c = context.getBean(Car.class,"c");
	System.out.println(c);
    }

}
