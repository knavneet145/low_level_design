package com.lld.RestaurentManagementSystem;

public class UPIPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying amount "+amount+" using UPI.");
    }
}
