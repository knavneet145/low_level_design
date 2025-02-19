package com.lld.RideSharing.ServiceUtil;

import com.lld.RideSharing.Driver;
import com.lld.RideSharing.Location;
import com.lld.RideSharing.RideSharingDAO;
import com.lld.RideSharing.User;

import java.util.ArrayList;
import java.util.List;

public class NearByDrivers {
    private static final double thresholdDis = 5;
    public static List<User> findNearByDrivers(Location location) {
        RideSharingDAO rideSharingDAO = RideSharingDAO.getInstance();
        List<User> drivers = rideSharingDAO.getAllDrivers();
        List<User> nearByDrivers = new ArrayList<>();
        for (User driver: drivers) {
            if (DistanceCalculator.calculateDistance(location, driver.getCurrentLocation()) <= thresholdDis){
                nearByDrivers.add(driver);
            }
        }
        return nearByDrivers;
    }
}
