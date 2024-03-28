package com.prowings.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowirngtest {
    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-autowiring.xml");
	  
	Employee emp1 = context.getBean(Employee.class,"emp");
	System.out.println(emp1);
    }

}
