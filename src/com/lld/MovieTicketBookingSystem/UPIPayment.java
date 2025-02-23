package com.lld.MovieTicketBookingSystem;

public class UPIPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying amount using UPI..");
    }
}
