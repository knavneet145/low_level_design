package com.lld.RideSharing.Factory;

import com.lld.RideSharing.*;
import com.lld.RideSharing.Constants.PaymentType;

public class RideFactory {
    private static long id = 0;
    private static RideSharingDAO rideSharingDAO = RideSharingDAO.getInstance();
    public static Ride buildRide(Location src, Location dest, Passanger passanger, PaymentType paymentType) {
        Ride ride = new Ride(String.valueOf(++id),src,dest,passanger,paymentType);
        rideSharingDAO.addRide(ride);
        return ride;
    }
}
