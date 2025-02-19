package com.lld.OnlineShoppingService;

public class Payment {
    private String paymentId;
    private double amount;
    private PaymentType type;
    private PaymentStatus status;
    private String orderId;

    public Payment(String paymentId, double amount, PaymentType type, PaymentStatus status, String orderId) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.type = type;
        this.status = status;
        this.orderId = orderId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentType getType() {
        return type;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
