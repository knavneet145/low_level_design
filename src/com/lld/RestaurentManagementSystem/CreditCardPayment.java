package com.lld.RestaurentManagementSystem;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying amount "+amount+" using credit card");
    }
}
