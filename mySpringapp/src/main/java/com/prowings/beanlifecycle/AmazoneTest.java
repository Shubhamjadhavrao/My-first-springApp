package com.prowings.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmazoneTest {
    public static void main(String[] args) {

	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-beanlifecycle.xml");

	Amazone a1 = context.getBean(Amazone.class, "a");

	System.out.println(a1);
	context.registerShutdownHook();

    }
}
