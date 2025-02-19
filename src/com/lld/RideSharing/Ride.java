package com.lld.RideSharing;

import com.lld.RideSharing.Constants.PaymentStatus;
import com.lld.RideSharing.Constants.PaymentType;
import com.lld.RideSharing.Constants.RideStatus;

public class Ride {
    private final String id;
    private Location src;
    private Location dest;
    private Driver driver;
    private final Passanger passanger;
    private PaymentStatus paymentStatus;
    private double amount;
    private RideStatus rideStatus;
    private PaymentType paymentType;

    public Ride(String id, Location src, Location dest, Passanger passanger, PaymentType paymentType) {
        this.id = id;
        this.src = src;
        this.dest = dest;
        this.passanger = passanger;
        this.paymentStatus = PaymentStatus.PENDING;
        this.rideStatus = RideStatus.REQUESTED;
        this.paymentType = paymentType;
    }

    public String getId() {
        return id;
    }

    public Location getSrc() {
        return src;
    }

    public Location getDest() {
        return dest;
    }

    public Driver getDriver() {
        return driver;
    }

    public Passanger getPassanger() {
        return passanger;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public double getAmount() {
        return amount;
    }

    public RideStatus getRideStatus() {
        return rideStatus;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setSrc(Location src) {
        this.src = src;
    }

    public void setDest(Location dest) {
        this.dest = dest;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
