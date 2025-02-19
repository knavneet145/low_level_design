package com.lld.RestaurentManagementSystem.Factory;

import com.lld.RestaurentManagementSystem.CashPayment;
import com.lld.RestaurentManagementSystem.CreditCardPayment;
import com.lld.RestaurentManagementSystem.Payment;
import com.lld.RestaurentManagementSystem.UPIPayment;

public class PaymentFactory {
    public static Payment generatePayment(String paymentType) {
        if (paymentType == "cash") return new CashPayment();
        else if (paymentType == "creditcard") return new CreditCardPayment();
        else if (paymentType == "upipayment") return new UPIPayment();
        return null;
    }
}
