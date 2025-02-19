package com.lld.RideSharing.ServiceUtil;

import com.lld.RideSharing.Location;

public class DistanceCalculator {
    public static double calculateDistance(Location src, Location dest) {
        long x1 = src.getLongitude();
        long y1 = src.getLattitude();
        long x2 = dest.getLongitude();
        long y2 = dest.getLattitude();
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
