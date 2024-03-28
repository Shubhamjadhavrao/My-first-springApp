package com.prowings.autowiring;

public class Employee {
    private String name;
    private Address address;

    public Employee() {
	super();

    }

    public Employee(Address address) {
	super();
	System.out.println("address injected through constructor!!");
	this.address = address;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

    @Override
    public String toString() {
	return "Employee [name=" + name + ", address=" + address + "]";
    }

   
}
