package com.prowings.springapp;

public class Employee {
    private int id;
    private String name;
    private String address;

    public Employee() {
	super();
	System.out.println("initializing Emplyee using no arg constructor!!!");
    }

    public Employee(int id, String name, String address) {
	super();
	System.out.println("initializing Emplyee using all arg constructor!!!");
	this.id = id;
	this.name = name;
	this.address = address;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	System.out.println("initializing Emplyee id -  using setter!!!");
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	System.out.println("initializing Emplyee name-using setter!!!");
	this.name = name;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	System.out.println("initializing Emplyee address-  using setterr!!!");
	this.address = address;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
    }

}
