package com.voya.oopsOverloading;

public class Vehicle {

    String brand;
    double price;
    String model;

    public Vehicle(){

    }

    public Vehicle(String brand){
        this();
        this.brand = brand;
    }

    public Vehicle(double price) {
        this();
        this.price = price;
    }

    public Vehicle(String brand, String model) {
        this(brand);

        this.model = model;
    }

    public Vehicle(String brand, double price, String model) {
        this(brand, model);

        this.price = price;

    }

        void getDetails(){
        if(model != null && brand!= null  ){
            System.out.println("Brand: "+brand);
            System.out.println("Model: "+model);

        }if(price>0){
                System.out.println("Price: "+price);
            }
    }
}
