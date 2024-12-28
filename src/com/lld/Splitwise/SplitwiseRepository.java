package com.lld.Splitwise;

import java.util.concurrent.ConcurrentHashMap;

public class SplitwiseRepository {
    private static final ConcurrentHashMap<String, User> usersDB = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Expense> expenseDB = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Group> groupDB = new ConcurrentHashMap<>();

    public static User getUser(String userId) { return usersDB.get(userId); }

    public static void addUser(User user) {
        usersDB.put(user.getId(), user);
    }

    public static Expense getExpense(String expenseId) {
        return expenseDB.get(expenseId);
    }

    public static void addExpense(Expense expense) {
        expenseDB.put(expense.getId(), expense);
    }

    public static Group getGroup(String groupId) {
        return groupDB.get(groupId);
    }

    public static void addGroup(Group group) {
        groupDB.put(group.getId(), group);
    }

    public static void deleteGroup(String groupId) {
        groupDB.remove(groupId);
    }

    public static void deleteExpense(String expenseId) {
        expenseDB.remove(expenseId);
    }
}
