package com.prowings.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// spring bean life cycle using Interface 
public class EmployeeTest   {
    
   public static void main(String[] args) {
       AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring-beans-beanlifecycle.xml");
       
       Employee emp1 = context.getBean(Employee.class,"emp");
       System.out.println(emp1);
       context.registerShutdownHook();
}
    
    

}
