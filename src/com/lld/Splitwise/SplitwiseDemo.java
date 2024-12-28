package com.lld.Splitwise;

import java.util.Arrays;

public class SplitwiseDemo implements Runnable {

    @Override
    public void run() {
        SplitwiseService splitwise = SplitwiseService.getInstance();
        Group group = splitwise.createGroup();
        User []users = new User[3];
        users[0] = splitwise.createUser("navneet", "np.eng97@gmail.com");
        users[1] = splitwise.createUser("kushal", "kushal.paudel@gmail.com");
        users[2] = splitwise.createUser("Hardik", "hardik.praj@gmail.com");
        splitwise.addUserToGroup(group, users[0]);
        splitwise.addUserToGroup(group, users[1]);
        splitwise.addUserToGroup(group, users[2]);
        User u1 = users[0], u2 = users[1], u3 = users[2];
        GroupExpense groupExpense = splitwise.createGroupExpense("puducherry trip", u1.getId(), 18000, Arrays.asList(new Split(u1.getId(), 6000), new Split(u2.getId(), 6000), new Split(u3.getId(), 6000)), group.getId());
        Expense expense = splitwise.createExpense("christmas celebration", u1.getId(), 9000, Arrays.asList(new Split(u1.getId(), 3000), new Split(u2.getId(), 3000), new Split(u3.getId(), 3000)));
        splitwise.editExpense(groupExpense.getId(), groupExpense.description, u2.getId(), 24000, Arrays.asList(new Split(u1.getId(), 8000), new Split(u2.getId(), 8000), new Split(u3.getId(), 8000)));
        group.addExpense(groupExpense.getId());
        for (int i = 0; i < 3; i++) {
            System.out.println("total owed by " + users[i].getName() + ": " +  + users[i].getTotalOwed());
            System.out.println(users[i].getName() + " owes: " + users[i].getTotalOwes());
            System.out.println("");
        }
    }
}
