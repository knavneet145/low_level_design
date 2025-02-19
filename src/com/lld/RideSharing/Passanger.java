package com.lld.RideSharing;

import com.lld.RideSharing.ServiceUtil.PaymentService;

import java.util.ArrayList;
import java.util.List;

public class Passanger extends User{
    List<Transaction> transactions = new ArrayList<>();

    public Passanger(String name, String id, Location currentLocation) {
        super(name, id, currentLocation);
        this.ongoingRide = null;
    }

    public void makePayment(double amount) {
        PaymentService.makePayment(amount);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}
