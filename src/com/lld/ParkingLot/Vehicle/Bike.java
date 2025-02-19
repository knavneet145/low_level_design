package com.lld.ParkingLot.Vehicle;

public class Bike extends Vehicle {
    public Bike(String id) {
        super(id);
        this.vehicleType = VehicleType.BIKE;
    }
}
