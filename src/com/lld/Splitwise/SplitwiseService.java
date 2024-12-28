package com.lld.Splitwise;
import java.util.List;

public class SplitwiseService {
    private long groupIdCounter = 0;
    private long userIdCounter = 0;
    private long expenseIdCounter = 0;
    public static SplitwiseService instance = null;

    private SplitwiseService() {}

    public static SplitwiseService getInstance() {
        if (instance == null) {
            instance = new SplitwiseService();
        }

        return instance;
    }

    public Group createGroup() {
        Group group = new Group(String.valueOf(++groupIdCounter));
        SplitwiseRepository.addGroup(group);
        return group;
    }

    public User createUser(String name, String email) {
        User user = new User(String.valueOf(++userIdCounter), name, email);
        SplitwiseRepository.addUser(user);
        return user;
    }

    public void addUserToGroup(Group group, User user) {
        group.addUser(user.getId());
        SplitwiseRepository.addGroup(group);
    }

    public GroupExpense createGroupExpense(String desc, String payer, double amount, List<Split> participants, String groupId) {
        GroupExpense groupExpense = new GroupExpense(String.valueOf(++expenseIdCounter), amount, participants, desc, payer, groupId);
        SplitwiseServiceUtil.ManageExpense(groupExpense);
        return groupExpense;
    }

    public Expense createExpense(String desc, String payer, double amount, List<Split> participants) {
        Expense expense = new Expense(String.valueOf(++expenseIdCounter), amount, participants, desc, payer);
        SplitwiseServiceUtil.ManageExpense(expense);
        return expense;
    }

    public void editExpense(String expenseId, String desc, String payer, double amount, List<Split> participants) {
        if (SplitwiseRepository.getExpense(expenseId) == null) {
            return;
        }
        Expense expense = new Expense(expenseId, amount, participants, desc, payer);
        SplitwiseServiceUtil.manageEditExpense(expense);
    }
}
