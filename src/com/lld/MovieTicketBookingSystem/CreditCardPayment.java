package com.lld.MovieTicketBookingSystem;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying the amount using credit card..");
    }
}
