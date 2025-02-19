package com.lld.RideSharing.ServiceUtil;

import com.lld.RideSharing.Location;
import com.lld.RideSharing.Ride;

public class FareCalculationService {
    private static final int costPerKM = 10;
    public static double calculateFare(Ride ride) {
        Location src = ride.getSrc();
        Location dest = ride.getDest();
        double disTravelled = DistanceCalculator.calculateDistance(src, dest);
        return costPerKM * disTravelled;
    }
}
