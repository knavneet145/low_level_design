package com.lld.RestaurentManagementSystem;

public class CashPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying amount " + amount+" using cash");
    }
}
