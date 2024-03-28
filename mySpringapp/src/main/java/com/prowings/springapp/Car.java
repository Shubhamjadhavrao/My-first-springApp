package com.prowings.springapp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Car {
    private int id;
    private String company;
    private List<String> features;
    private Set<String> components;
    private Map<Integer, String> parts;
    private Properties Carprops;

    public Car() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Car(int id, String company, List<String> features, Set<String>components, Map<Integer, String> parts,
	    Properties carprops) {
	super();
	this.id = id;
	this.company = company;
	this.components = components;
	this.features = features;
	this.parts = parts;
	Carprops = carprops;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getCompany() {
	return company;
    }

    public void setCompany(String company) {
	this.company = company;
    }

    public Set<String> getComponents() {
	return components;
    }

    public void setComponents(Set<String> components) {
	this.components = components;
    }

    public Map<Integer, String> getParts() {
	return parts;
    }

    public void setParts(Map<Integer, String> parts) {
	this.parts = parts;
    }

    public Properties getCarprops() {
	return Carprops;
    }

    public void setCarprops(Properties carprops) {
	Carprops = carprops;
    }

    public List<String> getFeatures() {
	return features;
    }

    public void setFeatures(List<String> features) {
	this.features = features;
    }

    @Override
    public String toString() {
	return "Car [id=" + id + ", company=" + company + ", components=" + components + ", features=" + features
		+ ", parts=" + parts + ", Carprops=" + Carprops + "]";
    }

}
