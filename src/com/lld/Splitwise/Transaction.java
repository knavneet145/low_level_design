package com.lld.Splitwise;

public class Transaction {
    private final String id;
    private final String sender;
    private final String reciever;
    private final double amount;

    public String getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getReciever() {
        return reciever;
    }

    public double getAmount() {
        return amount;
    }

    public Transaction(String id, String sender, String reciever, double amount) {
        this.id = id;
        this.sender = sender;
        this.reciever = reciever;
        this.amount = amount;
    }
}
