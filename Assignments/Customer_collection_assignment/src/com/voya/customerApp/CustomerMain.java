package com.voya.customerApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer("Prabhakar",1,"bengaluru");
        customerList.add(customer1);

        Customer customer2 = new Customer("Rahul",2,"bengaluru");
        customerList.add(customer2);

        Customer customer3 = new Customer("Ramesh",3,"bengaluru");
        customerList.add(customer3);

        Customer customer4 = new Customer("Mahesh",4,"bengaluru");
        customerList.add(customer4);

        for (Customer customer:customerList){
            System.out.println(customer);
        }

        System.out.println("-----------------------");

        List<Customer> customerCity = new ArrayList<>();
        String city = "bengaluru";
        for (Customer customer:customerList){
            if (customer.getCity().equals(city)){
                customerCity.add(customer);
            }
        }

        for (Customer customersInBengalurur:customerCity){
            System.out.println(customersInBengalurur);
        }


    }
}
