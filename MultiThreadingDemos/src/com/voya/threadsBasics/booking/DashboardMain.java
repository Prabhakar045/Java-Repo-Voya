package com.voya.threadsBasics.booking;

public class DashboardMain {

    public static void main(String[] args) {
        Booking booking = new Booking();


        //counter for 3 people
        Counter counter1 = new Counter("Prabhakar",5,booking);
        Counter counter2 = new Counter("rahul",12,booking);
        Counter counter3 = new Counter("modi",25,booking);
    }
}
