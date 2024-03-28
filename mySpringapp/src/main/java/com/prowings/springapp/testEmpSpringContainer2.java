package com.prowings.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testEmpSpringContainer2 {
    
    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
	
	Employee emp1 = context.getBean(Employee.class,"emp");
	
    }

}
