package com.prowings.circularDependency;

public class A {
    private B b;

    public A() {
	super();
	System.out.println("inside A no arg constructor!!");
    }

    public A(B b) {
	super();
	this.b = b;
	System.out.println("insideA(B b) constructor");
    }
    
    public void init() {
	System.out.println("using init method");
	b.setA(this);
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
        System.out.println("inside setter method class A - setB()");
    }
    
    

}
