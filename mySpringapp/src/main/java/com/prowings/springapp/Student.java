package com.prowings.springapp;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Address> addresses;

    public Student() {
	super();
	// TODO Auto-generated constructor stub
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public List<Address> getAddresses() {
	return addresses;
    }

    public void setAddresses(List<Address> addresses) {
	this.addresses = addresses;
    }

    @Override
    public String toString() {
	return "Student [id=" + id + ", name=" + name + ", addresses=" + addresses + "]";
    }

}
