package com.prowings.circularDependency;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class A2 implements ApplicationContextAware, InitializingBean {
    private B b;
    private ApplicationContext context;

    public A2() {
	super();
	System.out.println("inside A2's no-arg constructor!!");
	
    }

    public A2(B b) {
	super();
	this.b = b;
	System.out.println("inside A2(B b) constructor!!");
    }

    public B getB() {
	return b;
    }

    public void setB(B b) {
	this.b = b;
	System.out.println("inside setter method of Class A - setB()");
    }

    public ApplicationContext getContext() {
	return context;
    }

    public void setContext(ApplicationContext context) {
	this.context = context;
	
    }

    

    @Override
    public void afterPropertiesSet() throws Exception {
	b=context.getBean(B.class,b);
	
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	context=applicationContext;
    }

}
