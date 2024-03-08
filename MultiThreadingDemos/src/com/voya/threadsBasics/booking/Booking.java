package com.voya.threadsBasics.booking;

public class Booking {

    double bookTickets(String name, int noOfTickets){
        double costPerTicket = 200;
        System.out.println(name);
        double totalPrice = costPerTicket*noOfTickets;
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total amount: "+totalPrice);
        return totalPrice;
    }
}
