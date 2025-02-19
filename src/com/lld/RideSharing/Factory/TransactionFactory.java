package com.lld.RideSharing.Factory;

import com.lld.RideSharing.Constants.PaymentType;
import com.lld.RideSharing.Transaction;

public class TransactionFactory {
    private static long id = 0;
    public static Transaction getTransaction(double amount, PaymentType paymentType) {
        return new Transaction(String.valueOf(++id), amount,paymentType);
    }
}
