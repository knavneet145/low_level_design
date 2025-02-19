package com.lld.ParkingLot;

import com.lld.ParkingLot.Vehicle.Vehicle;

public abstract class ParkingSpot {
    SpotType spotType;
    boolean available;
    String levelId;
    Vehicle vehicle;
    String id;

    public ParkingSpot(String levelId, String spotId) {
        this.available = true;
        this.levelId = levelId;
        this.id = spotId;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
