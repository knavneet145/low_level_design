package com.lld.Splitwise;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String id;
    private final List<String> participants;
    private final List<String> expenses;

    public Group(String id) {
        participants = new ArrayList<>();
        expenses = new ArrayList<>();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<String> getUsers() {
        return participants;
    }

    public List<String> getExpenses() {
        return expenses;
    }

    public void addExpense(String expenseId) {
        expenses.add(expenseId);
    }

    public void addUser(String userId) {
        participants.add(userId);
    }

    public void deleteExpense(String id) {
        SplitwiseRepository.deleteExpense(id);
    }
}
