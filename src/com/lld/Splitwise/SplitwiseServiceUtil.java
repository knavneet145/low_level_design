package com.lld.Splitwise;

public class SplitwiseServiceUtil {

    public static void ManageExpense(Expense expense) {
        SplitwiseRepository.addExpense(expense);
        manageImpcatOnUsers(expense);
    }

    public static void manageEditExpense (Expense expense) {
        negateImpactOfOlderExpense(SplitwiseRepository.getExpense(expense.getId()));
        SplitwiseRepository.getExpense(expense.getId()).editExpense(expense);
        manageImpcatOnUsers(expense);
    }

    private static void manageImpcatOnUsers(Expense expense) {
        User payer = SplitwiseRepository.getUser(expense.getPayer());
        payer.getExpenses().add(expense.getId());

        for(Split split: expense.getParticipants()) {
            if (split.user.equals(expense.getPayer())) continue;
            User user = SplitwiseRepository.getUser(split.user);
            user.getOwes().put(payer.getId(), user.getOwes().getOrDefault(payer.getId(), 0.0) + split.share);
            payer.getOwed().put(user.getId(), payer.getOwed().getOrDefault(user.getId(), 0.0) + split.share);
            payer.setTotalOwed(payer.getTotalOwed() + split.share);
            user.setTotalOwes(user.getTotalOwes() + split.share);
            user.getExpenses().add(expense.getId());
        }
    }

    private static void negateImpactOfOlderExpense(Expense expense) {
        User payer = SplitwiseRepository.getUser(expense.getPayer());
        payer.getExpenses().remove(expense.getId());
        for(Split split: expense.getParticipants()) {
            if (split.user.equals(expense.getPayer())) continue;
            User user = SplitwiseRepository.getUser(split.user);
            user.getOwes().put(payer.getId(), user.getOwes().getOrDefault(payer.getId(), 0.0) - split.share);
            payer.getOwed().put(user.getId(), payer.getOwed().getOrDefault(user.getId(), 0.0) - split.share);
            payer.setTotalOwed(payer.getTotalOwed() - split.share);
            user.setTotalOwes(user.getTotalOwes() - split.share);
            user.getExpenses().remove(expense.getId());
        }
    }
}
