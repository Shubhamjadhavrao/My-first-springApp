package com.prowings.springapp;

public class C {
    public C() {
   	super();
   	System.out.println("C is initialized");
       }
    
    public C(String b) {
   	super();
   	System.out.println(b.getClass().getName());
   	System.out.println(b);
   	System.out.println("C is initialized");
       }

}
