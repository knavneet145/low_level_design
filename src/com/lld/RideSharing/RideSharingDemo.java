package com.lld.RideSharing;

import com.lld.RideSharing.Constants.PaymentType;
import com.lld.RideSharing.Factory.RideFactory;
import com.lld.RideSharing.Factory.UserFactory;

public class RideSharingDemo implements Runnable{
    public void run() {
        RideSharingService rideSharingService = RideSharingService.getInstance();
        Driver vikas = UserFactory.buildDriver("vikas", new Location(7653, 897, "pari chowk"));
        Passanger navneet = UserFactory.buildPassaanger("navneet", new Location(9472, 2371, "Galgotia college"));
        Ride ride = RideFactory.buildRide(navneet.currentLocation,new Location(22307, 102283, "jagat form"),navneet, PaymentType.UPI);
        rideSharingService.requestRide(ride);
        rideSharingService.acceptRide(ride, vikas);
        rideSharingService.onRideComplete(ride);
    }
}
