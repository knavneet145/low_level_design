package com.lld.RideSharing;

import com.lld.RideSharing.Constants.RideStatus;

import java.util.ArrayList;
import java.util.List;

public class Driver extends User {
    private final List<Ride> requests;

    public Driver(String name, String id, Location currentLocation) {
        super(name, id, currentLocation);
        isDriver = true;
        this.requests = new ArrayList<>();
    }

    public void addRequest(Ride ride) {
        requests.add(ride);
    }

    public void clearRequests() {
        requests.clear();
    }

    public void acceptRequest(Ride ride, Driver driver) {
        requests.remove(ride);
        ride.setRideStatus(RideStatus.ONGOING);
        ride.setDriver(driver);
        ride.getPassanger().ongoingRide = ride;
    }

    public void declineRequest(Ride ride) {
        requests.remove(ride);
        ride.setRideStatus(RideStatus.DECLINED);
    }
}
