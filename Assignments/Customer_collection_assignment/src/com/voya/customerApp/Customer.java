package com.voya.customerApp;

public class Customer {
    private String customerName;
    private int custmerId;
    private String city;

    public Customer() {
    }

    public Customer(String customerName, int custmerId, String city) {
        this.customerName = customerName;
        this.custmerId = custmerId;
        this.city = city;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustmerId() {
        return custmerId;
    }

    public String getCity() {
        return city;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustmerId(int custmerId) {
        this.custmerId = custmerId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", custmerId=" + custmerId +
                ", city='" + city + '\'' +
                '}';
    }
}
