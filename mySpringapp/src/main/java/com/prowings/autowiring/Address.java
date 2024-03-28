package com.prowings.autowiring;

public class Address {
    private int pin;
    private String City;
    private String Country;
    
    

    public Address() {
	super();
	System.out.println("address initialized!!");
    }

    public int getPin() {
	return pin;
    }

    public void setPin(int pin) {
	this.pin = pin;
    }

    public String getCity() {
	return City;
    }

    public void setCity(String city) {
	City = city;
    }

    public String getCountry() {
	return Country;
    }

    public void setCountry(String country) {
	Country = country;
    }

    @Override
    public String toString() {
	return "Address [pin=" + pin + ", City=" + City + ", Country=" + Country + "]";
    }
    
    

}
