package com.lld.ParkingLot.Vehicle;

import com.lld.ParkingLot.ParkingSpot;

public class Vehicle {
    String id;
    VehicleType vehicleType;
    ParkingSpot spot;

    public Vehicle(String id) {
        this.id = id;
    }

    public void setSpot(ParkingSpot spot) {
        this.spot = spot;
    }

    public String getId() {
        return id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public ParkingSpot getSpot() {
        return spot;
    }
}
