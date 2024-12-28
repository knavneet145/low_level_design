package com.lld.Splitwise;

import java.util.List;

public class Expense {
    String id;
    double amount;
    List<Split> participants;
    String description;
    String payer;

    public Expense(String id, double amount, List<Split> participants, String desc, String owner) {
        this.id = id;
        this.amount = amount;
        this.participants = participants;
        this.description = desc;
        this.payer = owner;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public List<Split> getParticipants() {
        return participants;
    }

    public String getDescription() {
        return description;
    }

    public String getPayer() {
        return payer;
    }

    public void editExpense(Expense expense) {
        this.amount = expense.amount;
        this.participants = expense.participants;
        this.description = expense.description;
        this.payer = expense.payer;
    }
}
