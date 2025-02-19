package com.lld.RideSharing;

import com.lld.RideSharing.Constants.PaymentType;

public class Transaction {

    private final String id;
    private final double amount;
    private final PaymentType paymentType;

    public Transaction(String id, double amount, PaymentType paymentType) {
        this.id = id;
        this.amount = amount;
        this.paymentType = paymentType;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }
}
