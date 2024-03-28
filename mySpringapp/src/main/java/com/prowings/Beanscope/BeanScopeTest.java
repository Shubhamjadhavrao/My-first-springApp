package com.prowings.Beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTest {
    public static void main(String[] args) {
	
   ApplicationContext context= new ClassPathXmlApplicationContext("spring-beansScope.xml");
      Employee emp1 = context.getBean(Employee.class,"employee");
      Employee emp2 = context.getBean(Employee.class,"employee");
       System.out.println(emp1.hashCode());
      System.out.println(emp1);
      System.out.println(emp2.hashCode());
      System.out.println(emp1==emp2);
    }

}
