package com.prowings.beanlifecycle;

public class Amazone {
    private int id;
    private double price;
    private String product;

    public Amazone() {
	super();

    }
    
    public void MyInitMethod() {
	System.out.println("inside init Method......");
    }
    
    public void DestroyMethod() {
  	System.out.println("inside Destroy Method......");
      }

    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    public String getProduct() {
	return product;
    }

    public void setProduct(String product) {
	this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
	return "Amazone [id=" + id + ", price=" + price + ", product=" + product + "]";
    }

  
}
