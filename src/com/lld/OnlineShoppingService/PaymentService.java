package com.lld.OnlineShoppingService;

import com.lld.OnlineShoppingService.Factory.PaymentFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PaymentService {
    private ExecutorService executorService = Executors.newFixedThreadPool(1);
    public static boolean payUsingCard(double amount, String orderId) {
        System.out.println("Payment has been done for amount " + amount);
        CompletableFuture.runAsync(() -> {
                    Payment payment = PaymentFactory.getPaymentInstance(amount, PaymentType.CARD, orderId);
                    payment.setStatus(PaymentStatus.DONE);
                    Order order = DAO.getOrder(orderId);
                    order.setPayment(payment);
                }
        );
        return true;
    }
}
