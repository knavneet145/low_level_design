package com.lld.Splitwise;

import java.util.List;

public class GroupExpense extends Expense {
    private final String groupId;

    public GroupExpense(String id, double amount, List<Split> participants, String desc, String owner, String groupId) {
        super(id, amount, participants, desc, owner);
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getPayer() {
        return super.payer;
    }

    public String getDesc() {
        return description;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public List<Split> getUsers() {
        return participants;
    }
}
