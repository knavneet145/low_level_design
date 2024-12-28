package com.lld.Splitwise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class User {
    private final String id;
    private final String name;
    private final String email;
    private double totalOwes = 0;
    private double totalOwed = 0;
    private final ConcurrentHashMap<String, Double> owed = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Double> owes = new ConcurrentHashMap<>();
    private final List<String> expenses = new ArrayList<>();

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void setTotalOwes(double totalOwes) {
        this.totalOwes = totalOwes;
    }

    public void setTotalOwed(double totalOwed) {
        this.totalOwed = totalOwed;
    }

    public double getTotalOwes() {
        return totalOwes;
    }

    public double getTotalOwed() {
        return totalOwed;
    }

    public List<String> getExpenses() {
        return expenses;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ConcurrentHashMap<String, Double> getOwed() {
        return owed;
    }

    public ConcurrentHashMap<String, Double> getOwes() {
        return owes;
    }

    public String getId() {
        return id;
    }

    public void addExpense(String expenseId) {
        expenses.add(expenseId);
    }
}
