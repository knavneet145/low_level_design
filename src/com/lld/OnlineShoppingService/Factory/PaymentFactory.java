package com.lld.OnlineShoppingService.Factory;

import com.lld.OnlineShoppingService.Payment;
import com.lld.OnlineShoppingService.PaymentStatus;
import com.lld.OnlineShoppingService.PaymentType;

public class PaymentFactory {
    private static long id = 0;
    public static Payment getPaymentInstance(double amount, PaymentType type, String orderId) {
        return new Payment(String.valueOf(++id),amount, type, PaymentStatus.DONE, orderId);
    }
}
