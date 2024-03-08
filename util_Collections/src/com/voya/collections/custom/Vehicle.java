package com.voya.collections.custom;

public class Vehicle {

    private String model;
    private  String brand;
    private double price;

    public Vehicle(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public Vehicle() {
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
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
