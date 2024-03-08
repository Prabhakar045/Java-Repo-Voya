package com.voya.oopsEncapsulation;

public class Vehicle {

    private String model;
    private String brand;
    private double price;

    public void setModel(String model){
        this.model=model;
    }

    public String getModel(){
        return model;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
