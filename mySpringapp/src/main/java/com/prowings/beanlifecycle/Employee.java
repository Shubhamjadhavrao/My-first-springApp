package com.prowings.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
// spring bean life cycle using Interface 
public class Employee implements  InitializingBean,DisposableBean  {
    
    private int id;
    private String name;
    private String city;
    
    
    
    
    public Employee() {
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


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public void destroy() throws Exception {
	System.out.println("inside destroy method!!!!");
	
    }
    @Override
    public void afterPropertiesSet() throws Exception {
	System.out.println("inside after propertyset method !!!");
	
    }


    @Override
    public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
    }
    
    
    
    
    

}
