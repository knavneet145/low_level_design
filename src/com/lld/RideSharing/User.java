package com.lld.RideSharing;

import java.util.List;

public abstract class User {
    String name;
    String id;
    List<Ride> history;
    Ride ongoingRide;
    Location currentLocation;
    boolean isDriver = false;

    public User(String name, String id, Location currentLocation) {
        this.name = name;
        this.id = id;
        this.ongoingRide = null;
        this.currentLocation = currentLocation;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Ride> getHistory() {
        return history;
    }

    public Ride getOngoingRide() {
        return ongoingRide;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public boolean isDriver() {
        return isDriver;
    }
}
